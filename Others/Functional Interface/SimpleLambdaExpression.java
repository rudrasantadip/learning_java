/*
 * A simple lambda expression that takes no arguments and returns no value:
 */

 public class SimpleLambdaExpression{
    public static void main(String[] args) {
        Runnable runnable =  ()->System.out.println("Running thread using lambda expression");
        new Thread(runnable).start();
    }
 }


