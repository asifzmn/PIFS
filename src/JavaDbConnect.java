import java.sql.*;
import javax.swing.*;

public class JavaDbConnect {
    
    private static Connection connection = null;

    public static Connection dbConnect(String FileName) {
        try {
            Class.forName("org.sqlite.JDBC");
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:sqlite:D:\\Database\\"+ FileName +".sqlite");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hospital_management","root","");
            //JOptionPane.showMessageDialog(null, "Connection established!");
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}