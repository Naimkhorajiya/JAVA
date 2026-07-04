
import java.util.Scanner;

class Book 
{
    String title;
    String author;


    Book() 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
    }


    void display() 
	{
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Q6
{

 public static void main(String r[] ) 
	{
        Book b = new Book();
        b.display();
    }
}

