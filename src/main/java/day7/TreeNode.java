package day7;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public TreeNode(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}
