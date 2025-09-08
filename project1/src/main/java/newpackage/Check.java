package newpackage;

public class Check {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        // Compare characters while i < j
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        // Example strings to check for palindrome
        String s1 = "Java";  
        String s2 = "Malayalam";

        // Check and print results for s1
        if (isPalindrome(s1)) {
            System.out.println(s1 + " is a palindrome.");
        } else {
            System.out.println(s1 + " is not a palindrome.");
        }

        // Check and print results for s2
        if (isPalindrome(s2)) {
            System.out.println(s2 + " is a palindrome.");
        } else {
            System.out.println(s2 + " is not a palindrome.");
        }
    }
}
