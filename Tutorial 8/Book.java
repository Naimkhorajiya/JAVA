class Book {
    String title;
    String author;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Book Author: ");
        author = sc.nextLine();
    }

    void display() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}