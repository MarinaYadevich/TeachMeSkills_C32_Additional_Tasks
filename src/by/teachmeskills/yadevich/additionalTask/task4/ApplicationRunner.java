package by.teachmeskills.yadevich.additionalTask.task4;

/** Task 4.
 Rotate an array of 'n' elements to the right by 'k' steps.
 For example, with 'n' = 7 and 'k' = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int kSteps = 3;

        ArrayRotation.rotatesArray(array, kSteps);

//        array2[0] = array[4];
//        array2[1] = array[5];
//        array2[2] = array[6];
//
//        array2[3] = array[0];
//        array2[4] = array[1];
//        array2[5] = array[2];
//        array2[6] = array[3];
    }
}

