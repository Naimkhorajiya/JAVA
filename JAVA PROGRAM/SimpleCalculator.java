//Name: Tanna Mansi
//Roll no: 54

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();  

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble(); 

       
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

  
        if (num2 != 0) {
            quotient = num1 / num2
     
