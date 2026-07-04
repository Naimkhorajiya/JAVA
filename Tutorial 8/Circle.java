class Circle {
    double radius;
    double area;

    Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        radius = sc.nextDouble();
        area = Math.PI * radius * radius;
    }

    void display() {
        System.out.println("Circle Radius: " + radius + ", Area: " + area);
    }
}