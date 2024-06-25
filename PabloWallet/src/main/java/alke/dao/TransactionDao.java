package alke.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import alke.model.Transaction;
import alke.util.DBUtil;

public class TransactionDao {
    public void saveTransaction(Transaction transaction) {
        String INSERT_TRANSACTION_SQL = "INSERT INTO transactions (userId, amount, date, description) VALUES (?, ?, ?, ?)";

        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_TRANSACTION_SQL)) {
            preparedStatement.setInt(1, transaction.getUserId());
            preparedStatement.setDouble(2, transaction.getAmount());
            preparedStatement.setDate(3, new java.sql.Date(transaction.getDate().getTime()));
            preparedStatement.setString(4, transaction.getDescription());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

     private void printSQLException(SQLException ex) {
        // Método para imprimir detalles de la excepción SQLException
    }
}
