//Name:Tanna Mansi
//Roll no: 54

import java.util.Scanner;

public class SimpleInterest3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the principal amount: ");
        float principal = input.nextFloat();

        
        System.out.print("Enter the rate of interest: ");
        float rate = input.nextFloat();

        
        System.out.print("Enter the time in years: ");
        float time = input.nextFloat();

       
        float simpleInterest = (principal * rate * time) / 100;

        
        System.out.println("Simple Interest is: " + simpleInterest);

       
        input.close();
    }
}