import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DB
{
    private String query;
    private String url,username,password;

    DB(String url,String username,String password)
    {
        this.url=url;
        this.username=username;
        this.password=password;
    }


    public void create_database(String db_name) throws SQLException
    {
        try
        {
            Connection con = DriverManager.getConnection(this.url,this.username,this.password);
            Statement st = con.createStatement();
            query="CREATE DATABASE "+db_name;
            st.executeUpdate(query);
            con.close();
            System.out.println("Database "+db_name+" has been created Successfully");
        }
        catch (SQLException e)
        {           
            System.out.println(e.getMessage());
        }
    }


    public void delete_database(String db_name) throws SQLException
    {
        try
        {
            Connection con = DriverManager.getConnection(this.url, this.username, this.password);
            Statement st = con.createStatement();
            query="DROP DATABASE "+db_name;
            st.executeUpdate(query);
            System.out.println("Database "+db_name+" has been deleted Successfully");
            con.close();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void create_table(String table_name,String db_name)
    {
        try 
        {
           Connection con = DriverManager.getConnection(this.url, this.username, this.password);
           Statement st = con.createStatement();
           query = "USE " + db_name;
           st.executeUpdate(query);
           query = "CREATE TABLE "+table_name+" (id int , name varchar(50) , roll int , stream varchar(20), PRIMARY KEY (id) );";
           st.executeUpdate(query);
           con.close();
           System.out.println("Table "+table_name+" has been created successfully.");
        }
         catch (SQLException e)
        {
            System.out.println(e.getMessage());    
        }
      
    }

    public void delete_table(String table_name, String db_name)
    {
        try
        {

            query = "USE "+db_name;
            Connection con = DriverManager.getConnection(this.url,this.username,this.password);
            Statement st = con.createStatement();
            st.executeUpdate(query);
            query = "DROP TABLE "+table_name;
            st.executeUpdate(query);
            con.close();
            System.out.println("Table "+table_name+" has been successfully deleted.");  
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void insert_data(String db_name,String table_name, Student s1)
    {
        try 
        {
            Connection con = DriverManager.getConnection(this.url,this.username,this.password);
            Statement st = con.createStatement();
            query = "USE "+db_name;
            st.executeUpdate(query);

            String info[]  = s1.toString().split(",");
            query = "INSERT INTO "+table_name+" (id, name, roll, stream) VALUES (?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(info[0]));
            pst.setString(2,info[1]);
            pst.setInt(3,Integer.parseInt(info[2]));
            pst.setString(4,info[3]);
            pst.execute();

            System.out.println("Data inserted successfully.");
            con.close();

        }
        catch (SQLException e) 
        {
           System.out.println(e.getMessage());
        }
    }

    public void fetch_all(String db_name,String table_name)
    {
        try 
        {
            Connection con = DriverManager.getConnection(this.url, this.username, this.password);
            Statement st = con.createStatement();
            query = "USE "+db_name;
            st.execute(query);
            query = "SELECT * FROM "+table_name;
            ResultSet rs = st.executeQuery(query);
            
            System.out.println("ID\tNAME\t       ROLL\t  STREAM");
            while (rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));   
            }
        }
         catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
}
