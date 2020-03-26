public class Main {

    public static void main(String[] args) {
        TreeNode root = BTreeFactory.buildSmallTree();
        BTreePrinter.printNode(root);

        TreeNode result = searchBST(root, 2);
        BTreePrinter.printNode(result);
    }

    static TreeNode searchBST(TreeNode root, int val) {

        if (root == null || val == root.val) {
            return root;
        }

        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }

    }


}

