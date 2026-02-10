import java.util.Scanner;

class User_input
{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        try
        {
            input = Integer.parseInt(sc.nextLine());   
            System.out.println(input);
        }

        catch (NumberFormatException e)
        {
            System.out.println("Please enter an integer number.");
        }
        sc.close();

    }
}