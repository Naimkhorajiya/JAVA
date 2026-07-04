class Laptop {
    String model;
    double price;

    Laptop() {
        model = "";
        price = 0.0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Laptop Model: ");
        model = sc.nextLine();
        System.out.print("Enter Laptop Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Laptop Model: " + model + ", Price: $" + price);
    }
}