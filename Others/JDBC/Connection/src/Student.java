import java.sql.SQLException;
import java.util.Scanner;


public class Student 
{
    
    protected int id,roll;
    protected String name,stream;

   


    Student (int id, String name, int roll, String stream)
    {
        this.id=id;
        this.name=name;
        this.roll=roll;
        this.stream=stream;
    }

    public String toString()
    {
        return ""+this.id+","+this.name+","+this.roll+","+this.stream;
    }
    public static void main(String[] args) throws SQLException
    {
        String url,username,password,db_name,table;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Url: ");
        url = sc.next();
        System.out.print("\nEnter username: ");
        username=sc.next();
        System.out.print("\nEnter password: ");
        password=sc.next();
        System.out.print("\nEnter the name of the database: ");
        db_name=sc.next();
        System.out.print("\nEnter the name of the table: ");
        table=sc.next();
        try
        {
            DB obj = new DB(url,username,password);
            obj.fetch_all(db_name, table);
        }
        catch (Exception e)
        {
            System.out.println("Connection Aborted Please check the issue."+"\n"+e.getMessage());
        }
       
        sc.close();
   
    }
    
}
