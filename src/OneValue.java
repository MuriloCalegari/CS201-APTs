import util.TreeNode;

public class OneValue {
    public int count(TreeNode tree) {

        int count = 0;

        if(isLeaf(tree)) return 1;

        if (tree.left != null) {
            count += count(tree.left);
        }

        if(tree.right != null) {
            count += count(tree.right);
        }

        if(checkChildrenEquality(tree)) {
            count++;
            return count;
        }

        return count;
    }

    public boolean checkChildrenEquality(TreeNode node) {

        if(isLeaf(node)) return true;

        if(node.left != null && node.info != node.left.info) {
            return false;
        }

        if(node.right != null && node.info != node.right.info) {
            return false;
        }

        if(node.left != null) {
            if(!checkChildrenEquality(node.left)) {
                return false;
            }
        }
        if(node.right != null) {
            if(!checkChildrenEquality(node.right)) {
                return false;
            }
        }

        return true;
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}