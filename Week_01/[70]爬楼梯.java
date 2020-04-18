//You are climbing a stair case. It takes n steps to reach to the top. 
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can yo
//u climb to the top? 
//
// Note: Given n will be a positive integer. 
//
// Example 1: 
//
// 
//Input: 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
// 
//
// Example 2: 
//
// 
//Input: 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
// Related Topics 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        return (int) ((1/Math.sqrt(5)) * (Math.pow((1 + Math.sqrt(5))/2, n+1) -  Math.pow((1 - Math.sqrt(5))/2, n+1)));
//
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (n == 2) {
//            return 2;
//        }
//
//        int one_before_step = 2;
//        int two_before_steps = 1;
//        int all_steps = 0;
//
//        for (int i = 2; i < n; i++) {
//            all_steps = one_before_step + two_before_steps;
//            two_before_steps = one_before_step;
//            one_before_step = all_steps;
//        }
//        return all_steps;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
