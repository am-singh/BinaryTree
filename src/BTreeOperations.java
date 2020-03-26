/**
 * BTreeOperations
 */
public class BTreeOperations {

    
    /**
     * 
     * Time complexity:<br>
     * O(H) where H is the height of the tree. That results in O(log n) in the average case and O(n) in worst case.
     * <br><br>
     * Space complexity:<br>
     * O(H) to keep the recursion stack. O(log n) in average case, O(n) in worst case.
     * 
     * @param root root of the binary tree
     * @param val the value to be searched for
     * @return subtree where given val is the root of
     */
    TreeNode searchRecursively(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchRecursively(root.left, val);
        } else {
            return searchRecursively(root.right, val);
        }
    }

    /**
     * 
     * Time complexity:<br>
     * O(H) where H is the height of the tree. That results in O(log n) in the average case and O(n) in worst case.
     * <br><br>
     * Space complexity:<br>
     * O(1) no extra space needed.
     * 
     * @param root root of the binary tree
     * @param val the value to be searched for
     * @return subtree where given val is the root of
     */
    TreeNode searchIteravely(TreeNode root, int val) {
        while (root != null && val != root.val) {
            if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }
}