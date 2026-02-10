// This is a demo to show the association example, We shall use the smart card and employee example.
class SmartCard
{
    public void Attendance(Employee e)
    {
        System.out.println("Employee ID "+ e.get_id() + " has been marked present");
    }
}

class Employee 
{
   private String emp_id,name,role;
    
    Employee (String id, String name, String role)
    {
        this.emp_id = id;
        this.name = name;
        this.role = role;
    }

    public String get_id()
    {
        return this.emp_id;
    }

    public String toString()
    {
        String info = this.emp_id+", "+this.name+", "+this.role;
        return info;
    }

    public void Swap(SmartCard s)
    {
        s.Attendance(this);
    }

}
public class Association_Demo
{
    public static void main(String[] args)
    {
        Employee santadip = new Employee("100", "Santadip Rudra","Programmer");
        SmartCard santas_card = new SmartCard();
        santas_card.Attendance(santadip);
    }
} 

/*  Here the two classes SmartCard and Employee are completely independent of each other but use each other's
functionalities. Such a relationship is called a associative relation ship.
 */ 
