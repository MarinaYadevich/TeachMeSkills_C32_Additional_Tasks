package by.teachmeskills.yadevich.additionalTask.task1hardest;

import java.util.Scanner;

/** Complication of the problem 1*.
 A number of any length (from zero to infinity) is entered. It is necessary to find the sum of its
 digits.
 */

public class ApplicationRunner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        String strNumber = sc.nextLine();
        sc.close();

        AdditionDigitsNumber2.addDigitsNumber(strNumber);
    }
}

