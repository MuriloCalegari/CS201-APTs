import util.TreeNode;

import java.util.TreeMap;

public class LeafTrails {

    TreeMap<Integer, String> leafTrails;

    public String[] trails(TreeNode tree) {
        leafTrails = new TreeMap<>();

        appendToPath(tree, "");

        String[] ret = new String[leafTrails.size()];

        int i = 0;
        for(String s: leafTrails.values()) {
            ret[i] = s;
            i++;
        }

        return ret;
    }

    public void appendToPath(TreeNode root, String pathSoFar) {

        if(root == null) return;

        // is Leaf
        if(root.left == null && root.right == null) {
            leafTrails.put(root.info, pathSoFar);
            return;
        }

        appendToPath(root.left, pathSoFar + "0");
        appendToPath(root.right, pathSoFar + "1");
    }
}