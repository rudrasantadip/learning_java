public class LongestCommonSequence
{
    int i,j;
    String subseq(String str1, String str2)
    {
        String sub="";
        int len;
        if (str1.length()>str2.length())
        {
            i=0;
            len = str2.length()-1;
            while(len>=0)
            {
                if(str1.charAt(i)==str2.charAt(i))
                {
                    sub+=str2.charAt(i);
                    i++;
                }
                else
                { 
                   i++;
                }
                len--;
            }
        }
        else
        {
            i=0;
            len = str1.length()-1;
            while(len>=0)
            {
                if(str1.charAt(i)==str2.charAt(i))
                {
                    sub+=str1.charAt(i);
                    i++;
                }
                else
                {
                    i++;
                }
                len--;
            }   
        }
        return sub;
    }
    public static void main(String[] args)
    {
        LongestCommonSequence obj = new LongestCommonSequence();
        String sub_sequence= obj.subseq("abcdge","abedg");
        System.out.println(sub_sequence);
    }
}