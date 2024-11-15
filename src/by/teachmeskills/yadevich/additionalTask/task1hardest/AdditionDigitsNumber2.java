package by.teachmeskills.yadevich.additionalTask.task1hardest;

public class AdditionDigitsNumber2 {

    public static int addDigitsNumber(String number) {
        String regex = "\\d+";
        int sumDigits = 0;

        if (number.matches(regex)) {

            for (char ch : number.toCharArray()) {
                sumDigits += Character.getNumericValue(ch); // получает числовое значение из символа
            }

        }else{
            throw new IllegalArgumentException("Error: Not a number entered or a negative number.");
        }
        System.out.println("Sum of digits: " + sumDigits);
        return sumDigits;
    }
}

