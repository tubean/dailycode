package day3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)
    {
        TreeNode treeNode = new TreeNode(5);
        TreeNode treeLeft1 = new TreeNode(4);
        TreeNode treeLeft2 = new TreeNode(1);
        TreeNode treeRight1 = new TreeNode(7);
        TreeNode treeRight2 = new TreeNode(9);

        treeLeft1.left = treeLeft2;
        treeRight1.right = treeRight2;
        treeNode.left = treeLeft1;
        treeNode.right = treeRight2;

        String ser = serialize(treeNode);
        System.out.println("After serialize : " + ser);

        TreeNode des = deserialize(ser);

        System.out.println("After deserialize, the new node equals to the origin one: " + treeNode.equals(des));

    }

    private static String serialize(TreeNode root) {
        // return X if node = null
        if(root == null) return "X";
        // get left tree
        String leftSerialized = serialize(root.left);
        // get right tree
        String rightSerialized = serialize(root.right);
        return root.val + "," + leftSerialized + "," + rightSerialized;
    }

    private static TreeNode deserialize(String str) {
        Queue<String> nodesLeft = new LinkedList<>(Arrays.asList(str.split(",")));
        return deserializeHelper(nodesLeft);
    }

    private static TreeNode deserializeHelper(Queue<String> nodesLeft) {
        String nodeVal = nodesLeft.poll();
        if(nodeVal.equals("X")) return null;
        TreeNode newNode = new TreeNode(Integer.valueOf(nodeVal));
        newNode.left = deserializeHelper(nodesLeft);
        newNode.right = deserializeHelper(nodesLeft);
        return newNode;
    }

}
