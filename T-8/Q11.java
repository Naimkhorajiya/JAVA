class Book 
{
    String title, author;
    double price;

    Book(String t, String a, double p) 
	{
        title = t;
        author = a;
        price = p;
    }

    void display() 
	{
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Q11
{
    public static void main(String a[]) {
        Book b = new Book("Java Programming", "James Gosling", 499.99);
        b.display();
    }
}
