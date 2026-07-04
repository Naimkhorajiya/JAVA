
import java.io*;
 class CompoundInterest {
    public static void main(String[] args) {
       
        double principal = 2000;  
        double rate = 5;         
        double time = 3;          

     
        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        // Print the result
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Compound Interest: " + compoundInterest);
    }
}
