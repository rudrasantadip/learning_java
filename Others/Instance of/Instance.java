class Instance
{
    public static void main(String[] args) 
    {
     Instance obj = new Instance();
     System.out.println(obj instanceof Instance); // Checking if object belongs to the given class.
     System.out.println(obj.getClass().getSimpleName());
     System.out.println(obj.getClass().getName());   
     System.out.println(obj.getClass().getClassLoader());
    }
}