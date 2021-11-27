import util.TreeNode;

public class OddishTreeCount {
    public int count(TreeNode tree) {

        if(tree == null) return 0;

        int count = 0;

        count += count(tree.left);
        count += count(tree.right);

        if(tree.info % 2 != 0) {
            return count += 1;
        } else {
            return count;
        }
    }
}