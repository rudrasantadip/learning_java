public class ControlFlow
{
    public static String function2()
    {
        System.out.println("Function 2");
        return "function 2";
    }

    public static String function1()
    {
        System.out.println("Function 1");
        return function2();
    }

    public static void main(String[] args)
    {
        int a=2;
        if(a==2);
        {
            System.out.println("A is 2");
        }    

        function1();
        function2();
       
    }
}