/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            ans.add(node.val);

            // Left first
            if (node.left != null) {
                stack.push(node.left);
            }

            // Right second
            if (node.right != null) {
                stack.push(node.right);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}