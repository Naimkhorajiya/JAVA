public class NumberCheck {
    public static void main(String[] args) {
        int number = 25;      // Number to check
        int lowerBound = 10;  // Lower limit
        int upperBound = 50;  // Upper limit

        if (number > lowerBound && number < upperBound) {
            System.out.println(number + " lies between " + lowerBound + " and " + upperBound);
        } else {
            System.out.println(number + " does NOT lie between " + lowerBound + " and " + upperBound);
        }
    }
}
