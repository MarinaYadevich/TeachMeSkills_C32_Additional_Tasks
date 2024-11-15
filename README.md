# Дополнительные задания:
Task 1.
The user enters a three-digit number.
The program must add up the digits that make up this number.
For example, if 349 was entered, the program must display the number 16, since
3 + 4 + 9 = 16.

Complication of the problem 1*.
A number of any length (from zero to infinity) is entered. It is necessary to find the sum of its
digits.

Task 2.
Euclidean Algorithm.
The Euclidean Algorithm is an algorithm for finding the greatest common divisor (GCD) of a pair of integers.
The greatest common divisor (GCD) is a number that divides two numbers without remainder
and is itself divisible without remainder by any other divisor of these two numbers. Simply put, 
this is the largest number by which two numbers, for which the GCD is sought, can be divided without remainder.
Algorithm for finding the GCD by subtraction:
1. Subtract the smaller number from the larger number.
2. If the result is 0, then the numbers are equal to each other and are the GCD
   (you should exit the loop).
3. If the result of the subtraction is not equal to 0, then the larger number is replaced by the
   result of the subtraction.
4. Go to point 1.

Task 3.
Bank deposit.
A user makes a deposit of "a" rubles for a period of "years" at 10% per annum
(each year the size of his deposit increases by 10%. This money is added to
the deposit amount, and next year there will also be interest on it).
Write a program bank that takes the arguments "a" and "years" and returns
the amount that will be in the user's account.

Task 4.
Rotate an array of 'n' elements to the right by 'k' steps.
For example, with 'n' = 7 and 'k' = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Task 5.
Given two words (start and end) and a dictionary, find the length of the shortest
sequence of transformations from start to end, in which only one letter can be changed at a time.
And each intermediate word must exist in the dictionary.
For example, given:
start = "hit"
end = "cog"
dict = ["hot", "dot", "dog", "lot", "log"]
One shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
the program should return a length of 5.

Task 6.
Given an array of integers, find two numbers that add up to a given number.
The twoSum function should return the indices of two numbers so that they add up to a target number.
For example:
Input: numbers={2, 7, 11, 15}, target=9.
Output: index1=0, index2=1.
