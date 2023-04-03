package pl.javastart.task;

public class PalindromeService {

    private int[] reverseArray(int[] array) {
        int lenght = array.length;

        int[] reversedArray = new int[lenght];

        for (int i = 0; i < reversedArray.length; i++) {
            int j = lenght - 1 - i;
            reversedArray[i] = array[j];
        }
        return reversedArray;
    }

    private int compareNumbers(int[] array) {
        String reversedString = createString(reverseArray(array));
        String originalString = createString(array);
        int reversedNumber = Integer.parseInt(reversedString);
        int originalNumber = Integer.parseInt(originalString);
        int subtractionDifference = originalNumber - reversedNumber;
        return subtractionDifference;
    }

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (checkArray(array)) {
            if (compareNumbers(array) == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private boolean checkArray(int[] array) {
        if (array != null) {
            if (checkFields(array)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    private boolean checkFields(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        if (sum == 0) {
            return false;
        } else {
            return true;
        }
    }

    private String createString(int[] table) {
        String stringOfNumbers = "";
        for (int i = 0; i < table.length; i++) {
            stringOfNumbers = stringOfNumbers + table[i];
        }
        return stringOfNumbers;
    }
}