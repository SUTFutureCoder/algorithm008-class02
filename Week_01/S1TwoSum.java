package Week_01;

import java.util.HashSet;

public class S1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num: nums) {
            hashSet.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(target - nums[i])) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == target - nums[i] && j != i) {
                        System.out.println(i);
                        System.out.println(j);
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

}
