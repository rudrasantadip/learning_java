import java.util.ArrayList;
import java.util.List;

class Student
{
    private int id;
    private String name;
    private String stream;

    static String  schoolName="ABC";

    void print()
    {
        System.out.println("Student");
    }

    public Student(int id, String name, String stream)
    {
        this.id=id;
        this.name=name;
        this.stream=stream;
    }

    public Student()
    {

    }

    void show_details()
    {
        System.out.println(id+" "+stream+" "+name);
    }

    public int getId()
    {
        return id;
    }

}

class School
{
   
    public static void main(String[] args)
    {
         List <Student> studentlist = new ArrayList<>();

        studentlist.add(new Student(1,"santadip","csit"));
        studentlist.add(new Student(2,"piyasa","cs"));

        System.out.println(studentlist);

    }
}