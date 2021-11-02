import util.TreeNode;

public class PathSum {
    public int hasPath(int target, TreeNode tree){

        if(tree == null) return 0;

        if(tree.left == null && tree.right == null && tree.info == target) return 1;

        int sumNeeded = target - tree.info;

        if(hasPath(sumNeeded, tree.left) == 1 ||
                hasPath(sumNeeded, tree.right) == 1) {
            return 1;
        }

        return 0;
    }
}