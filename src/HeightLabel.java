import util.TreeNode;

public class HeightLabel {
    public TreeNode rewire(TreeNode t) {

        int leftHeight = 0;
        int rightHeight = 0;

        if (t.left != null) {
            t.left = rewire(t.left);
            leftHeight = t.left.info;
        }

        if(t.right != null) {
            t.right = rewire(t.right);
            rightHeight = t.right.info;
        }

        t.info = 1 + Math.max(leftHeight, rightHeight);

        return t;
    }
}