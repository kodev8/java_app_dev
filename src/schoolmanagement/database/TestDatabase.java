package schoolmanagement.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDatabase {
    Connection con = null;


    TestDatabase() {
        String url = "jdbc:mysql://localhost:3306/test_database";
        String username = "root";
        String password = "root";


        try {
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to the database successful!");
        } catch (SQLException e) {
            System.out.println("Connection to the database failed!");
            e.printStackTrace();
        } 
}

    public void insert() throws SQLException {


       
            // String url = "jdbc:mysql://localhost:3306/test_database";
            // String username = "root";
            // String password = "root";

            // Connection to the db
            // con = DriverManager.getConnection(url, username, password);

            PreparedStatement statement = con.prepareStatement("INSERT INTO sample (id, name) VALUES (?, ?)");

            statement.setInt(1, 1);
            statement.setString(2, "John");

            PreparedStatement prepAlterTable = con.prepareStatement("ALTER TABLE sample ADD COLUMN age INT");

            statement.executeUpdate();
            prepAlterTable.executeUpdate();

    }


    public void read() throws SQLException  {

        PreparedStatement prepRead = con.prepareStatement("SELECT * FROM sample where id = ?");

        //  index, value
        prepRead.setInt(1, 1);

        ResultSet rs = prepRead.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("age"));
        }
        con.close();


        
    }
    public static void main (String args[]) {

        TestDatabase testDatabase = new TestDatabase();
        try {
            testDatabase.read();
        } catch (SQLException e) {
            e.printStackTrace();
        }
            

    };
}
