package day3;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public boolean equals(TreeNode o) {
        if (this == o) return true;
        if (o == null) return false;
        return val == o.val &&
                ((left == null && o.left == null) || left.equals(o.left)) &&
                ((right == null && o.right == null) || right.equals(o.right));
    }

}
