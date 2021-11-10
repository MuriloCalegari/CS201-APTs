import util.TreeNode;

import java.util.TreeSet;

public class UniqueTreeValues {

    TreeSet<Integer> uniqueValues = new TreeSet<>();

    public int[] unique(TreeNode root) {

        addToSet(root);

        int[] ret = new int[uniqueValues.size()];

        int i = 0;
        for(int value: uniqueValues) {
            ret[i] = value;
            i++;
        }

        return ret;
    }

    public void addToSet(TreeNode root) {

        if(root == null) return;

        uniqueValues.add(root.info);

        addToSet(root.left);
        addToSet(root.right);
    }
}