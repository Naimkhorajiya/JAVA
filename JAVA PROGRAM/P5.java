//NAME: TANNA MANSI
//ROLL NO:54

public class P5{
    public static void main(String[] args) {
        double principal = 10000;  // P
        double rate = 8.5;         // R
        int time = 3;              // T

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Principal = " + principal);
        System.out.println("Rate of Interest = " + rate + "%");
        System.out.println("Time = " + time + " years");
        System.out.println("Compound Interest = " + ci);
    }
}