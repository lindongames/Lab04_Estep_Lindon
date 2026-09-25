public class Task03 {
    public static void main(String[] args) {

        double balance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double firstMonthInterest = balance * monthlyInterestRate;
        double balanceAfterOneMonth = balance + firstMonthInterest;

        double secondMonthInterest = balanceAfterOneMonth * monthlyInterestRate;
        double balanceAfterTwoMonths = balanceAfterOneMonth + secondMonthInterest;

        System.out.println("Starting Balance: $" + balance);
        System.out.println("Interest Due After One Month: $" + firstMonthInterest);
        System.out.println("Interest Due After Two Months: $" + secondMonthInterest);

    }
}