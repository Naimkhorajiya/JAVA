import java.io.*;
 class SimpleInterest {
    public static void main(String h[]) {

        double principal = 1000;
        double rate = 5;
        double time = 2;


        double interest = (principal * rate * time) / 100;


        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);
    }
}
