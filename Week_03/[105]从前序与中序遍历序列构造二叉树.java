package Week_03;//Given preorder and inorder traversal of a tree, construct the binary tree.
//
// Note: 
//You may assume that duplicates do not exist in the tree. 
//
// For example, given 
//
// 
//preorder = [3,9,20,15,7]
//inorder = [9,3,15,20,7] 
//
// Return the following binary tree: 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7 
// Related Topics 树 深度优先搜索 数组


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.HashMap;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    int[] preorder;
    int[] inorder;
    int pre_idx = 0;
    HashMap<Integer, Integer> in_map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
        int idx = 0;
        for (Integer n : inorder) {
            in_map.put(n, idx++);
        }
        return helper(0, inorder.length);
    }

    private TreeNode helper(int in_left, int in_right) {
        if (in_left == in_right) {
            return null;
        }
        int val = preorder[pre_idx];
        TreeNode root = new TreeNode(val);
        int index = in_map.get(val);
        pre_idx++;
        root.left = helper(in_left, index);
        root.right = helper(index+1, in_right);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
