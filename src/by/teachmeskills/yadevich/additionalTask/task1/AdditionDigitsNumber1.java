package by.teachmeskills.yadevich.additionalTask.task1;

public class AdditionDigitsNumber1 {

    public static int addDigitsNumber(int numberEntered){
        int sumDigits = 0;

        if(numberEntered <= 0){
            throw new IllegalArgumentException("The number entered is less than or equal to 0.");
        }else if (100 < numberEntered && numberEntered < 999){
            int firstDigit = numberEntered / 100;
            int secondDigit = (numberEntered % 100) / 10;
            int thirdDigit = numberEntered % 10;

            sumDigits = firstDigit + secondDigit + thirdDigit;
        }else{
            throw new IllegalArgumentException("Incorrect number.");
        }
        System.out.println("Sum of the digits of a number " + numberEntered + " : " + sumDigits);
        return sumDigits;
    }
}
