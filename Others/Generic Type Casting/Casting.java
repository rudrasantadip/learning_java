import java.util.ArrayList;
import java.util.Iterator;

class Casting 
{
    public static void main(String[] args)
    {
        int total=0;
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(-2);
    
        Iterator <Integer> iter = list.iterator(); 
        while (iter.hasNext())
        {
            Integer val = iter.next();
            total = total + val;
            System.out.println(val);
        }
        System.out.println(total);
        }
    }
