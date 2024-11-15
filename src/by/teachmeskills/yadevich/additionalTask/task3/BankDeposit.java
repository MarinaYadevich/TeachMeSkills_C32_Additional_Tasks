package by.teachmeskills.yadevich.additionalTask.task3;

public class BankDeposit {

    public static double calculateTotalAmountWithPercent(double deposit, int years){
        if(deposit <= 0 || years <= 0) {
            throw new IllegalArgumentException("This data cannot be negative.");
        }

        for(int i = 0; i < years; i++){
            deposit = (deposit * 0.1) + deposit;
        }
        System.out.println("Final amount on the account: " + deposit);
        return deposit;
    }
}
