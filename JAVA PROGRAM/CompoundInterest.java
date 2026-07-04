public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000; // initial amount
        double rate = 5;          // interest rate per year
        int time = 3;             // time in years

        double amount = principal;

        for (int i = 1; i <= time; i++) {
            amount = amount + (amount * rate / 100);
        }

        double compoundInterest = amount - principal;

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Compound Interest: " + compoundInterest);
        System.out.println("Total Amount: " + amount);
    }
}
