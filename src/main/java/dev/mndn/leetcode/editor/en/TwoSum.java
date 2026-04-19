// 2026-04-19 14:38:32

package dev.mndn.leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main() {
        Solution solution = new TwoSum().new Solution();
        int nums[][] = {
                {2,7,11,15}, {3,2,4}, {3,3}
        };
        int target[] = {9, 6, 6};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(
                    Arrays.toString(solution.twoSum(nums[i], target[i]))
            );
        }
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];

                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }

                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}