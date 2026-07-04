
public class Even {

   
    public static boolean isEven(int number) {
       
        if (number % 2 == 0) {
            return true; // Yes, it's even
        } else {
            return false; // Nope, it's odd
        }
    }

   
    public static void main(String[] args) {
        
        int myNumber = 42;

       
        if (isEven(myNumber)) {
            System.out.println(myNumber + " is even.");
        } else {
            System.out.println(myNumber + " is odd.");
        }
    }
}
