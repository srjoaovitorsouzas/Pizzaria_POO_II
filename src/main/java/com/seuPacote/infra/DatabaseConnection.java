package infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/pizzaria"; // Nome do banco de dados
    private static final String USER = "root"; // Usuário padrão do MySQL
    private static final String PASSWORD = ""; // Senha padrão do MySQL, geralmente vazia

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
