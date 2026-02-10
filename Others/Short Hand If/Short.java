/*
  ? --> In java is known as the character pair,
  it is a turnery operator used to construct conditional
  expressions of the form.
  
  exp1 ? exp 2 : exp3

  expression 2 is executed if the result is false,
  expression 3 is exevuted if the result is true

 */

import java.util.Scanner;

class Short
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b;

        a = 12;
        b = 18;
        boolean d = true;
        int x = (a>b) ? a:b;
        String str = (d==false) ? "This is right":"This is left";
        System.out.println(x);
        System.out.println(str);
        System.out.println(10&12);
    }
}
