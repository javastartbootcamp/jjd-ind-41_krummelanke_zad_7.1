package pl.javastart.task;

public class PalindromeService {

    private boolean compareNumbers(int[] array) {
        int tempSum = 0;
        for (int i = 0; i < (array.length / 2); i++) {
            tempSum = tempSum + array[i] - array[array.length - 1 - i];
        }
        if (tempSum == 0) {
            return true;
        } else {
            return false;
        }
    }

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (checkArray(array)) {
            if (compareNumbers(array)) {
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
}