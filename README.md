# BinaryTree
This repo holds a couple of basic operations executed on a binary tree.

### Example
```java
    public static void main(String[] args) {
        BTreeOperations operator = new BTreeOperations();
        TreeNode root = BTreeFactory.buildLargeTree();

        TreeNode result = operator.searchIteravely(root, 4);
        BTreePrinter.printNode(result);
    }
```
<img src="https://github.com/am-singh/BinaryTree/blob/master/images/binary_tree_printer.png" width="250" height="250">
