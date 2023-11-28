package schoolmanagement.database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class Database {

    Connection con;
    
    Database() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/test_database";
        String username = "root";
        String password = "root";   

        con = DriverManager.getConnection(url, username, password);
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
    
}
