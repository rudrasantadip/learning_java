import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;;


public class CreateDb
{
public static void main(String args[])
{


try 
{
    String url = "jdbc:mysql://localhost:3306/";

    String db_name = "Users";
    String user_name = "root";
    String password = "password";

    Connection connection = DriverManager.getConnection(url,user_name,password);
    String query = "CREATE DATABASE "+ db_name;

    Statement statement = connection.createStatement();
    statement.executeUpdate(query);
    statement.close();

    JOptionPane.showMessageDialog(null,db_name+"Database has been created successfully","System Message", JOptionPane.INFORMATION_MESSAGE);
    
} 
catch (Exception e) 
{
    e.printStackTrace();
}    

}
}
