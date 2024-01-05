package anudip;

import java.sql.Connection;
import java.sql.DriverManager;
public class Helper {

	static Connection conn;
    public static Connection createConnection() {
        try {
            // mention driver class name 
            // mysql driver class
            Class.forName("com.mysql.jdbc.Driver");
            // get connection details
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip_company", "root", "abhishek");
        } catch(Exception e) {
            System.out.println(e);
        }
        return conn;
    }

}
