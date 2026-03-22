package Palindrome;

import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah string: ");
        String userInput = input.nextLine();
        
        if (isPalindrome(userInput)) {
            System.out.println("\"" + userInput + "\" adalah sebuah palindrome");
        } else {
            System.out.println("\"" + userInput + "\" bukan sebuah palindrome");
        }
        
        input.close();
    }
    
    public static boolean isPalindrome(String input) {
        // Konversi ke lowercase untuk case-insensitive comparison
        String lowercase = input.toLowerCase();
        
        // Reverse string menggunakan StringBuilder
        String reversed = new StringBuilder(lowercase).reverse().toString();
        
        // Bandingkan string original dengan reversed
        return lowercase.equals(reversed);
    }
}
