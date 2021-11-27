import util.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class TreeSort {

    ArrayList<Integer> values = new ArrayList<>();

    public int[] sort(TreeNode tree) {

        addToList(tree);
        Collections.sort(values);

        int[] ret = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            ret[i] = values.get(i);
        }

        return ret;
    }

    public void addToList(TreeNode node) {

        values.add(node.info);

        if(node.left != null) addToList(node.left);
        if(node.right != null) addToList(node.right);
    }
}