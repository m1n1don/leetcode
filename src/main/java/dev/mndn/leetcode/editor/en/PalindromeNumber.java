// 2026-04-20 02:10:45

package dev.mndn.leetcode.editor.en;

public class PalindromeNumber {
    static void main() {
        Solution solution = new PalindromeNumber().new Solution();
        int[] nums = {
                121, -121, 10
        };
        for (int i = 0; i < nums.length; i++) {
            System.out.println(solution.isPalindrome(nums[i]));
        }
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(int x) {
            double x_sf = x;
            int digits = 1;
            if (x < 10) {
                return false;
            }
            for (int i = 1; i <= 100; i++) {
                if (x_sf < 10) {
                    break;
                }
                x_sf /= 10;
                digits++;
            }
            int ten = 1;
            double trials = digits / 2;
            if (digits % 2 != 0) {
                trials = Math.floor(digits / 2);
            }
            for (int j = 0; j <= trials; j++) {
                if (j == trials) {
                    return true;
                }
                if (Math.floor((x_sf * ten) % 10) != Math.floor((x % Math.pow(10, j + 1)) / Math.pow(10, j))) {
                    return false;
                }
                ten *= 10;
            }
            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}