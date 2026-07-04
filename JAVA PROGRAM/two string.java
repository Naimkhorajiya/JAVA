Import java.util.Scanner;

Public class string
{
 Public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
 System.out.print(“Enter first string: “);

 String str1 = scanner.nextLine();
 System.out.print(“Enter second string: “);

 String str2 = scanner.nextLine();
 If (str1.equals(str2)) {
 System.out.println(“The strings are equal (case-sensitive).”);
 } 
	else {
 System.out.println(“The strings are not equal (case-sensitive).”);
 }
 Scanner.close();
 }
}
