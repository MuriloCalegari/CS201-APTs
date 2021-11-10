import util.TreeNode;

public class TreeTighten {
    public TreeNode tighten(TreeNode t) {

        if(t.left == null ^ t.right == null) {
            TreeNode tightened = tighten(t.left == null ? t.right : t.left);
            t.info = tightened.info;
            return tightened;
        }

        if(t.left != null) t.left = tighten(t.left);
        if(t.right != null) t.right = tighten(t.right);

        return t;
    }
}