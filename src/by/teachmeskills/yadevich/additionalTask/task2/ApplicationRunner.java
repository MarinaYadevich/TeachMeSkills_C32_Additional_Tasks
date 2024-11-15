package by.teachmeskills.yadevich.additionalTask.task2;

import java.util.Scanner;

/** Task 2.
 Euclidean Algorithm
 The Euclidean Algorithm is an algorithm for finding the greatest common divisor (GCD) of a pair of integers.
 The greatest common divisor (GCD) is a number that divides two numbers without remainder
 and is itself divisible without remainder by any other divisor of these two numbers. Simply put, this is the largest number by which two numbers, for which the GCD is sought, can be divided without remainder.
 Algorithm for finding the GCD by subtraction:
 1. Subtract the smaller number from the larger number.
 2. If the result is 0, then the numbers are equal to each other and are the GCD
 (you should exit the loop).
 3. If the result of the subtraction is not equal to 0, then the larger number is replaced by the
 result of the subtraction.
 4. Go to point 1.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        FindingCommonDivisor.findCommonDivisor(number1,number2);
    }
}
