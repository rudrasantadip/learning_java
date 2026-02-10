/*
 * This is a demo to explain a Composition relationship
 * It is kind of a container relationship where there is an outer class
 * and an inner class and both of them cannot exits with out each other.
 * Like a books has pages and pages have lines.
 */

import java.util.ArrayList;
import java.util.Scanner;


class Book
{
static int i;
ArrayList <Page> pages = new ArrayList();
Scanner sc = new Scanner(System.in);
Book(int no_of_pages)
{
    for (i=0;i<no_of_pages;i++)
    {
        this.pages.add(new Page(sc.nextLine()));
    }
}
   
class Page
{

String sentence;
Page(String sentence)
{
    this.sentence=sentence;
}
    
}

public static void main(String[] args)
{
    Book b1 = new Book(5);    
}

}



