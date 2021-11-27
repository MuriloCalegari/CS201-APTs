import util.TreeNode;

public class NotATree {
    public String check(TreeNode root){

        if(root == null) return "not a tree";

        return isATree(root) ? "is a tree" : "not a tree";
    }

    private boolean isATree(TreeNode root) {
        if(root.left != null && root.right != null) return true;

        if(root.left != null && isATree(root.left)) {
            return true;
        }

        if(root.right != null && isATree(root.right)) {
            return true;
        }

        return false;
    }
}