import util.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedLeaves {
    public String[] values(TreeNode tree) {

        if(tree == null) return new String[0];

        List<Integer> info = new ArrayList<>();

        findLeafLists(info, tree);

        info.sort(Comparator.naturalOrder());

        String[] ret = new String[info.size()];

        for (int i = 0; i < info.size(); i++) {
            ret[i] = String.valueOf((char) (int) info.get(i));
        }

        return ret;
    }

    private void findLeafLists(List<Integer> letters, TreeNode tree) {
        if(tree.left == null && tree.right == null) {
            letters.add(tree.info);
        }

        if (tree.left != null) {
            findLeafLists(letters, tree.left);
        }

        if(tree.right != null) {
            findLeafLists(letters, tree.right);
        }
    }
}