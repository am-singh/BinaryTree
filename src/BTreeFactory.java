/**
 * BTreeFactory
 */
public class BTreeFactory {

    static TreeNode buildSmallTree() {
        TreeNode root = new TreeNode(4);

        TreeNode leftNode = new TreeNode(2);
        root.left = leftNode;

        TreeNode rightNode = new TreeNode(2);
        root.right = rightNode;

        TreeNode leftLeftChild = new TreeNode(1);
        leftNode.left = leftLeftChild;

        TreeNode leftRightChild = new TreeNode(3);
        leftNode.right = leftRightChild;

        return root;
    }
}