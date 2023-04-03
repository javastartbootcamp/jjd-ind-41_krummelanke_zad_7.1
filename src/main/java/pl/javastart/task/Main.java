package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{0, 1, 7, 7, 1, 0};

        boolean isPalindrome = palindromeService.isPalindrome(array);

        System.out.println(isPalindrome);
        // System.out.println(array.length / 2);
    }
}
