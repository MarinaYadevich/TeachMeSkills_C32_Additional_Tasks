package by.teachmeskills.yadevich.additionalTask.task1;

import java.util.Scanner;

/** Task 1.
 The user enters a three-digit number.
 The program must add up the digits that make up this number.
 For example, if 349 was entered, the program must display the number 16, since
 3 + 4 + 9 = 16.
 */

public class ApplicationRunner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit positive number: ");
        int number = sc.nextInt();
        sc.close();

        AdditionDigitsNumber1.addDigitsNumber(number);
    }
}
