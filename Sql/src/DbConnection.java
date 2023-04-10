import java.sql.*;

public class DbConnection {
    private static final String dbUrl="jdbc:sqlserver://DESKTOP-919RBUB:1433;database=db_lab2;encrypt=false;integratedSecurity=true;";
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection connection;
    public static Statement statement;

    public DbConnection() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        connection = DriverManager.getConnection(dbUrl);
        statement = connection.createStatement();
    }

    public void query(String query) throws SQLException {
        ResultSet resultSet = null;
        if (statement.execute(query)) {
            resultSet = statement.getResultSet();
            System.out.println(resultSet);
        }
    }
}
