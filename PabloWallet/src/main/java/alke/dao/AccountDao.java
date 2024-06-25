package alke.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import alke.model.Account;
import alke.util.DBUtil;

public class AccountDao {
    public void saveAccount(Account account) {
        String INSERT_ACCOUNT_SQL = "INSERT INTO accounts (userId, balance) VALUES (?, ?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT_SQL)) {
            preparedStatement.setInt(1, account.getUserId());
            preparedStatement.setDouble(2, account.getBalance());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public Account getAccountByUserId(int userId) {
        String SELECT_ACCOUNT_SQL = "SELECT * FROM accounts WHERE userId = ?";
        Account account = null;

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_SQL)) {
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                account = new Account();
                account.setUserId(rs.getInt("userId"));
                account.setBalance(rs.getDouble("balance"));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return account;
    }

    private void printSQLException(SQLException ex) {
        // Método para imprimir detalles de la excepción SQLException
    }
}
