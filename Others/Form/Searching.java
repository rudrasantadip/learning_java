import java.util.Scanner;






class Searching
{
    static int i,index;
    

    public static boolean isNumeric(String str) 
    {
    for (int i = 0; i < str.length(); i++)
    {
        if (!Character.isDigit(str.charAt(i)))
        {
            return false;
        }
    }
    return true;
    }

    static int search(int roll,int array[])
    {
        index=-1;
        for (i=0;i<array.length;i++)
        {
            if (roll==array[i])
            {
                index=i;
            }
        }
        return index;
    }
    
    static int search(String name, String array[])
    {
        index =-1;

        for(i=0;i<array.length;i++)
        {
            if(name.equalsIgnoreCase(array[i]))
            {
                index = i;
            }
        }
        return index;
    }


    

    public static void main(String args[])
    {
     
     Scanner sc = new Scanner(System.in);
     String [] names = {"Santadip","Anusua","Anupam","Anirban","Agniva","Piyasa","Parnali","Shreya"};   
    
     int [] roll_no = {21,22,25,35,67,65,79,82,12,11};
     String choice;


     System.out.println("Enter the name or Roll no to search: ");
     choice = sc.next();
     
     if (choice==null || choice.length()==0)
     {
        System.out.println("Field is empty.");
     }
     else if (isNumeric(choice)==true)
     {
        try
        {
            String searched_name = names[(int)search(Integer.parseInt(choice),roll_no)];
            System.out.println("The name against the roll no "+choice+ " is : "+searched_name);
        }
        catch (Exception e)
        {
            System.out.println("The Roll no you are trying to search does not exist");
        }
     }
     
    else
    {
        try
        {
            int searched_roll = roll_no[search(choice, names)];
            System.out.println("The roll no of the given name "+ choice +" is: "+searched_roll);
        }
        catch (Exception e)
        {
            System.out.println("The name you searched for does not exist");
        }
    }     
       
        sc.close();
       
    }

    
}