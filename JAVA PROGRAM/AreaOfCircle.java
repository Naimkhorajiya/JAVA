

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

    
        double pi = 3.14;

       
        double area = pi * radius * radius;

        
        System.out.println("Area of the circle is: " + area);
    }
}
