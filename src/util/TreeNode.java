package util;

public class TreeNode {
    public int info;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x){
        info = x;
    }
    TreeNode(int x, TreeNode lNode, TreeNode rNode){
        info = x;
        left = lNode;
        right = rNode;
    }
}