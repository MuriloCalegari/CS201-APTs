import util.TreeNode;

public class TreeBuilder {
    public TreeNode create(int[] values) {

        if(values.length == 0) return null;

        TreeNode root = new TreeNode(values[0]);

        findChildren(root, 0, values);

        return root;
    }

    private void findChildren(TreeNode node, int k, int[] values) {
        int upperBound = values.length - 1;

        if(2*k + 1 <= upperBound) {
            node.left = new TreeNode(values[2*k + 1]);
            findChildren(node.left, 2*k + 1, values);
        }

        if(2*k + 2 <= upperBound) {
            node.right = new TreeNode(values[2*k + 2]);
            findChildren(node.right, 2*k + 2, values);
        }
    }
}