import util.TreeNode;

public class SumTwoTrees {
    public TreeNode add(TreeNode a, TreeNode b) {

        int value = 0;

        if(a != null) value += a.info;
        if(b != null) value += b.info;

        TreeNode sum = new TreeNode(value);

        if(a != null && b != null) {
            sum.left = add(a.left, b.left);
            sum.right = add(a.right, b.right);
        }

        if (a == null && b != null) {
            sum.left = add(null, b.left);
            sum.right = add(null, b.right);
        }

        if(a != null && b == null) {
            sum.left = add(a.left, null);
            sum.right = add(a.right, null);
        }

        if(a == null && b == null) return null;

        return sum;
    }
}