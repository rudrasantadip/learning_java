import java.util.*;
public class Problem
{
static int i;
public static int isNumeric(String str) 
    {
    int flag = 1;
    if(str.length()==0 || str==null)
    {
        flag=0;
    }
    for (int i = 0; i < str.length(); i++)
    {
        if (!Character.isDigit(str.charAt(i)))
        {
            flag =-1; 
            return flag;
        }
    }
    return flag;
    }

public static int lookup(String arr[], String e)
{
    int index=-1;
    for(i=0;i<arr.length;i++)
    {
        if(arr[i].equalsIgnoreCase(e))
        {
            index=i;
            break;
        }
    }
    return index;
}
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String [] names = {"Santadip","Amit","Shreya","Anusua","Anirban"};    
        String [] rolls = {"1","2","3","4","5"};

        System.out.println("Enter a name or a roll no: ");
        String choice = sc.nextLine();

        if(isNumeric(choice)==0) // String is  empty.
        {
            System.out.println("Please enter a value, no input provided.");
        }
        try
        {
        if(isNumeric(choice)==-1)  // String contains non numeric characters
        {
            System.out.println("Name: "+choice+" Roll no: "+Integer.parseInt(rolls[lookup(names, choice)]));
        }
        else
        {
            System.out.println("Roll no: "+choice+" Name: "+names[lookup(rolls, choice)]);
        }
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Searched Element not found");
        }
        sc.close();
    }

}