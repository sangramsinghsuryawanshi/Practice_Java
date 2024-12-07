/*
17. Write a program to find the length of the longest palindrome
subsequence in a string. 
*/
public class LongestPalindromicSubsequenceRecursive {

    // Recursive function to find the LPS
    public static int lpsRecursive(String str, int i, int j) {
        // Base cases
        if (i > j) {
            return 0; // Invalid case
        }
        if (i == j) {
            return 1; // Single character is a palindrome
        }

        // If first and last characters match
        if (str.charAt(i) == str.charAt(j)) {
            return 2 + lpsRecursive(str, i + 1, j - 1);
        }

        // If they don't match
        return Math.max(
            lpsRecursive(str, i + 1, j), // Exclude the first character
            lpsRecursive(str, i, j - 1)  // Exclude the last character
        );
    }

    public static void main(String[] args) {
        String str = "agbdba";

        System.out.println("Given String: " + str);
        int lpsLength = lpsRecursive(str, 0, str.length() - 1);
        System.out.println("Length of Longest Palindromic Subsequence: " + lpsLength);
    }
}
