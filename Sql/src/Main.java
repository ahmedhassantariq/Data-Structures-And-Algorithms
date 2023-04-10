import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DbConnection dbConnection = new DbConnection();
//        dbConnection.query("Select * from employee where id = 0");
      dbConnection.query("select* from employee where id = 2 ");
//        dbConnection.query("insert into employee (id,names) values(12,'Ali 12'), (13,'Ali 13');");

    }
}
