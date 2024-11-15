package by.teachmeskills.yadevich.additionalTask.task3;

import java.util.Scanner;

/** Task 3.
 Bank deposit.
 A user makes a deposit of "a" rubles for a period of "years" at 10% per annum
 (each year the size of his deposit increases by 10%. This money is added to
 the deposit amount, and next year there will also be interest on it).
 Write a program bank that takes the arguments "a" and "years" and returns
 the amount that will be in the user's account.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your deposit amount: ");
        double deposit = sc.nextDouble();
        System.out.print("Specify the period(in years): ");
        int years = sc.nextInt();

        BankDeposit.calculateTotalAmountWithPercent(deposit, years);
    }
}
