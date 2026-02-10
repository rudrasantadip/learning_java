import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;




class Search
{
    int i,index;
    
    public boolean isNumeric(String str) 
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

    public int search(int roll, ArrayList<String> rolls)
    {
        index=-1;
        if(rolls.isEmpty()==true)
        {
            return index;
        }
        for (i=1;i<rolls.size();i++)
        {
            if (roll==Integer.parseInt(rolls.get(i)))
            {
                index=i;
            }
        }
        return index;
    }

    public  int search(String name, ArrayList<String> names)
    {
        index=-1;
        if(names.isEmpty()==true)
        {
            return index;
        }

         for (i=1;i<names.size();i++)
         {
            if (name.equalsIgnoreCase(names.get(i)))
            {
                index=i;
            }
         }
       

        return index;
    }

}
public class Main
{
    static int i;
   
    static void make_file(String path)
    {
        File obj = new File(path);
        try
        {
            obj.createNewFile();
            System.out.println("File has been created successfully");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    static void write_to_file(String path, String text)
    {
        try
        {
            FileWriter pen = new FileWriter(path);
            pen.write(text);
            pen.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    static ArrayList<String> read_from_file(String path) throws FileNotFoundException
    {
        ArrayList <String> lines = new ArrayList<>();
        File myfile = new File(path);
    
        try (BufferedReader br = new BufferedReader(new FileReader(myfile)))
         {
            try {
                String input;
                while((input=br.readLine())!=null)
                {
                    lines.add(input);
                }
            } catch (IOException e) {
                
                e.printStackTrace();
            }
        } 
        catch (FileNotFoundException e)
         {
            throw e;
        } 
        catch (IOException e) 
        {
            System.out.println("Please enter some value");
            e.printStackTrace();
        }
        return lines;
    }

  
    public static void main(String[] args) 
    {
       
        ArrayList<String> names = new ArrayList<>();
        ArrayList <String> rolls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        Search searching = new Search();
        

        try {
            names = read_from_file("names.csv");
            rolls = read_from_file("rolls.csv");
        } catch (FileNotFoundException e) {
           
            System.out.println("The file you are looking for does not exist");
        }


        System.out.print("Enter the name or roll no to search: ");
        String choice = sc.nextLine();
        
        
        if(choice==null || choice.length()==0)
        {
            System.out.println("Please enter some value");
        }

        else if (searching.isNumeric(choice)==true)
        {
            try
            {
                System.out.print("The name against the roll no "+choice+" is: ");
                System.out.println(names.get(searching.search(Integer.parseInt(choice),rolls)));
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println(names);
                System.out.println("The roll no you searched for does not exist");
            }
        }

        else
        {
            try
            {
                System.out.print("The roll no against the name "+choice+" is: ");
                System.out.println(rolls.get(searching.search((choice),names)));   
            }
            catch (IndexOutOfBoundsException e)
            {
                System.out.println(rolls);
                System.out.println("The name that you searched for does not exist: ");
            }
        }

    
        
       
        
        sc.close();
    }

}
    