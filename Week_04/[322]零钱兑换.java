//You are given coins of different denominations and a total amount of money amo
//unt. Write a function to compute the fewest number of coins that you need to mak
//e up that amount. If that amount of money cannot be made up by any combination o
//f the coins, return -1. 
//
// Example 1: 
//
// 
//Input: coins = [1, 2, 5], amount = 11
//Output: 3 
//Explanation: 11 = 5 + 5 + 1 
//
// Example 2: 
//
// 
//Input: coins = [2], amount = 3
//Output: -1
// 
//
// Note: 
//You may assume that you have an infinite number of each kind of coin. 
// Related Topics 动态规划


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (coins.length == 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int coinCnt = 0;
        Arrays.sort(coins);
        int idxLast = coins.length - 1;
        while (idxLast >= 0) {
            if (amount - coins[idxLast] >= 0) {
                amount -= coins[idxLast];
                System.out.println(amount);
                coinCnt++;
            } else {
                idxLast--;
            }
        }
        if (amount == 0) {
            return coinCnt;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
