package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();

        int[] array = new int[]{7, 9, 4, 1, 4, 9, 0};

        boolean isPalindrome = palindromeService.isPalindrome(array);

        System.out.println(isPalindrome);
    }
}
