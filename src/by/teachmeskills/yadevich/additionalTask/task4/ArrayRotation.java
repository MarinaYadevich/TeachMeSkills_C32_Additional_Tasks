package by.teachmeskills.yadevich.additionalTask.task4;

import java.util.Arrays;

public class ArrayRotation {

    public static void rotatesArray(int [] array, int kSteps){
        int[] array2 = new int[array.length];

        System.arraycopy(array, array.length - kSteps, array2,0, kSteps);
        System.arraycopy(array,0, array2, kSteps, kSteps + 1);

        System.out.println(Arrays.toString(array2));
    }
}
