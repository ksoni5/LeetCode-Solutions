package solutions;

class Solution {
    public static void name(String[] args) throws Exception {
        int j = 121;
        reverseInt(j);
    }

    public static boolean reverseInt(int x) {
        int reverse = 0;
        int original = x;
        while (x > 0) {
            int pop = x%10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return false;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return false;
            reverse = reverse*10 + pop;
            x = x/10;      
        }
        return reverse==original;
    }
}

// Runtime: 11 ms
// Memory Usage: 41.4 MB