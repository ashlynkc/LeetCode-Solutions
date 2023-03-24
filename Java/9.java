// Solution learned and followed by: https://www.youtube.com/watch?v=UPdSViixmDs
// (especially elegant solution, saves runtime significantly)
// Java
// LeetCode No. 9

class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        
        if (x < 0 || x % 10 == 0)
            return false;

        // implementation where you parse half the number,
        // then compare halves.
        int reverse = 0;

        while (x > reverse) {
            // pop the number at the end (mod 10 will give that)
            int pop = x % 10;
            x /= 10; // removes last digit

            reverse = (reverse * 10) + pop;
        }

        // OR case takes care of odd number input, such as 12321 since it cant be split perfectly
        if (x == reverse || x == reverse / 10)
            return true;
        else
            return false;

    }
}
