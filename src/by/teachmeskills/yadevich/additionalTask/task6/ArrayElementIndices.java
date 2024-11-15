package by.teachmeskills.yadevich.additionalTask.task6;

public class ArrayElementIndices {

    public static void twoSum(int[] array, int goal){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            int j = 1;
            sum = array[i] + array[j];
            if(sum == goal){
                System.out.println("Index1: " + i + ", index2: " + j);
                break;
            }
        }
        if(sum != goal){
            System.out.println("There are no two numbers that add up to: " + goal);
        }
    }
}
