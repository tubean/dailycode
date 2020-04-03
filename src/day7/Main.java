package day7;

public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(0, new TreeNode(0,
                new TreeNode(1), new TreeNode(1)), new TreeNode(0));
        /*
           0
          / \
         0   0
        / \
       1   1
         */

        System.out.println(getUnivalCount(root));
    }

    private static int getUnivalCount(TreeNode node){
        if (node == null)return 0;

        int count = getUnivalCount(node.left) + getUnivalCount(node.right);
        if(isUnivalTree(node)){
            count++;
        }

        return count;
    }

    private static boolean isUnivalTree(TreeNode node){
        if(node == null)
            return true;
        else if(node.left !=null && node.left.value == node.value)
            return true;
        else if (node.right !=null && node.right.value == node.value)
            return false;
        return isUnivalTree(node.left) && isUnivalTree(node.right);
    }

}
