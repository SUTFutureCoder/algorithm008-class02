学习笔记

回溯通用模板，可以通过增加参数配合for循环控制选取子问题范围。    

```java
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return res;
        }
        combination(nums, new Stack<Integer>());
        return res;
    }

    public void combination(int[] nums, Stack<Integer> stack) {
        if (stack.size() == nums.length) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (stack.contains(nums[i])) {
                continue;
            }
            stack.push(nums[i]);
            combination(nums, stack);
            stack.pop();
        }
    }
}

```

P.S. 看国际站discuss评论吐槽简直每日欢乐源泉

下周继续~
