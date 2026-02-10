/* 
This is a demo to show an aggregate relation ship.
To show a direction between the asssociation.
it is often called an 'has a' relationship
*/

import java.util.ArrayList;
import java.util.Scanner;

class Product
{
    private int id;
    private float price;

    Product (int id, float price)
    {
        this.price=price;
        this.id = id;
    }

    public String toString()
    {
        return "ID: "+this.id + "PRICE: "+this.price;
    }

    public float get_price()
    {
        return this.price;
    }

    public float get_id()
    {
        return this.id;
    }
}

class ShoppingCart 
{
    static int i;
    private float total_bill=0;
    private ArrayList <Product> products = new ArrayList<>();

    public void add_item(Product p)
    {
       products.add(p);
       total_bill += p.get_price();
    }

    public void remove_item (Product p)
    {
        for (i=0;i<this.products.size();i++)
        {
        if (products.get(i)!=p)
        {
            products.remove(p);
            total_bill-=p.get_price();
            System.out.println("Requested Item has been removed.");
        }
        else
        {
            System.out.println("Item Not in list.");
        }
        }
        
    }

    public void pay_bill()
    {
        System.out.println("Your total bill is "+this.total_bill +" Press 1 to pay.");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt()==1)
        {
            System.out.println("Your Payment has been done...");
        }
        else
        {
            System.out.println("Please pay the amount to claim your products.");
        }
    }
}

public class Shopping_demo
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();
        Product milk = new Product(151, 35.41f);
        Product oil = new Product(149, 100.78f);
        Product oil1 = new Product(149, 100.78f);
        
        cart.add_item(milk);
        cart.add_item(oil);
        cart.remove_item(oil);
        cart.pay_bill();
    }
} 