package schoolmanagement.database;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.io.IOException;
import schoolmanagement.models.Student;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import schoolmanagement.service.TestService;

public class TestStudent {


    public static void main (String args[]) {
        TestService testService = new TestService();

        try {   
            Database db = new Database();


            // ArrayList<Student> students = testService.readCSV();

            // create table if it does not exist
            // PreparedStatement prepCreateTable = db.con.prepareStatement("CREATE TABLE IF NOT EXISTS students (student_id VARCHAR(255), name VARCHAR(255), department VARCHAR(255), age INT, year VARCHAR(255), fee DOUBLE, paid VARCHAR(255))");
            // prepCreateTable.executeUpdate();

            // PreparedStatement prepInsert = db.con.prepareStatement("INSERT INTO students (student_id, name, department, age, year, fee, paid) VALUES (?, ?, ?, ?, ?, ?, ?)");
            // // insert data into table
            // for (Student student : students) {
            //     String age = student.getAge();
            //     int ageInt = (age != null && !age.equals("")) ? Integer.parseInt(age) : 0;

            //     System.out.println(student);

            //     prepInsert.setString(1, student.getStudentId());
            //     prepInsert.setString(2, student.getName());
            //     prepInsert.setString(3, student.getDepartment());
            //     prepInsert.setInt(4,ageInt);
            //     prepInsert.setString(5, student.getYear());
            //     prepInsert.setDouble(6, student.getFee());
            //     prepInsert.setString(7, student.getPaid());
            //     prepInsert.executeUpdate();
            // }

            System.out.println("Data inserted successfully!");

            // select data from table
            PreparedStatement prepSelect = db.con.prepareStatement("SELECT * FROM students Where Fee > ?");
            prepSelect.setDouble(1, 10000);
            ResultSet rs = prepSelect.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("student_id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("department"));
                System.out.println(rs.getInt("age"));
                System.out.println(rs.getString("year"));
                System.out.println(rs.getDouble("fee"));
                System.out.println(rs.getString("paid"));
                System.out.println();
            }

            db.closeConnection();

        // }catch (IOException e) {
        //     System.out.println("Error reading CSV file!");
        //     e.printStackTrace();

        }catch (SQLException e) {
            System.out.println("Error connecting to database!");
            e.printStackTrace();
        }


    };




    
}
