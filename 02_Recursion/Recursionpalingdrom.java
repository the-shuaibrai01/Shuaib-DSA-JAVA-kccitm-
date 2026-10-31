public class Recursionpalingdrom {

    public static void main(String[] args) {
        String str = "racecar";
        int left = 0;
        int right = str.length() - 1;
        System.out.println("Is palindrome: " + isPalindrome(str, left, right));
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return isPalindrome(str, left + 1, right - 1);
    }
}