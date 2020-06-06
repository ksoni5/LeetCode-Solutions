package solutions;

class Solution {
    public static void name(String[] args) throws Exception {
        int j = 5765336;
        reverseInt(j);
    }

    public static int reverseInt(int x) {
        int reverse = 0;
        while (x != 0) {
            int remainder = x%10;                               // part of pop method
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && remainder > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && remainder < -8)) return 0;
            reverse = reverse*10 + remainder;                   // push the last digit to the back of reverse
            x = x/10;                                           // part of pop method
        }
        return reverse;
    }
}

// Runtime: 1 ms
// Memory Usage: 36.4 MB