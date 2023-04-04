package pl.javastart.task;

public class PalindromeService {

    private boolean compareNumbers(int[] array) {
        int i = 0;
        while (i < (array.length / 2)) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            } else {
                i++;
            }
        }
        return true;
    }

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (checkArray(array) && checkLength(array)) {
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
            return true;
        } else {
            return false;
        }
    }

    private boolean checkLength(int[] array) {
        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }
}