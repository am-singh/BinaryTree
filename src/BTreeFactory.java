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

    static TreeNode buildLargeTree() {
        TreeNode root = new TreeNode(4);

        TreeNode node1 = new TreeNode(2);
        root.left = node1;

        TreeNode node2 = new TreeNode(2);
        root.right = node2;

        TreeNode node3 = new TreeNode(1);
        node1.left = node3;

        TreeNode node4 = new TreeNode(3);
        node1.right = node4;

        TreeNode node5 = new TreeNode(33);
        node2.right = node5;

        TreeNode node12 = new TreeNode(12);
        node5.left = node12;

        TreeNode node6 = new TreeNode(51);
        node5.right = node6;

        TreeNode node7 = new TreeNode(32);
        node6.left = node7;

        return root;
    }
}