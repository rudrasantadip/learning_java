// import  java.util.*;



public class Tokens

{
    

    public static void main(String args[])
    {
        int i;
        String s = "";
        s=s.trim();
        if(s.isEmpty())
        {
            System.out.println(0);    
        }
        else
        {
        s=s.replaceAll("[^a-zA-Z]", "_");
        s=s.replaceAll("_+", "_");

        String tokens [] = s.split("_");

        System.out.println(tokens.length);
        for (i=0;i<tokens.length;i++)
        {
            System.out.println(tokens[i]);
        }
        }
        
       
        

   

        

    }
}