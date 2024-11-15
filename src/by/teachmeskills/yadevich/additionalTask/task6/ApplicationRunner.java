package by.teachmeskills.yadevich.additionalTask.task6;

/** Task 6.
 Given an array of integers, find two numbers that add up to a given number.
 The twoSum function should return the indices of two numbers so that they add up to a target number.
 For example:
 Input: numbers={2, 7, 11, 15}, target=9.
 Output: index1=0, index2=1.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int goal = 18;

        ArrayElementIndices.twoSum(array, goal);
    }
}

