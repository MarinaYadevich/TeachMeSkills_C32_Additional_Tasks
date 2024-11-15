package by.teachmeskills.yadevich.additionalTask.task2;

public class FindingCommonDivisor {

    public static void  findCommonDivisor(int number1, int number2){
       while(number1 != number2){
           if(number1 > number2){
               number1= number1- number2;
           }else{
               number2 = number2 - number1;
           }
       }
        System.out.println("Greatest common divisor: " + number1);
    }
}

