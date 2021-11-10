import util.TreeNode;

import java.util.ArrayList;

public class LeafCollector {

    public String[] getLeaves(TreeNode tree) {
        ArrayList<ArrayList<String>> rounds = new ArrayList<>();

        ArrayList<String> currentLeaves;
        while(tree.left != null || tree.right != null) {
            currentLeaves = new ArrayList<>();
            findLeaves(tree, currentLeaves);
            rounds.add(currentLeaves);
        }

        currentLeaves = new ArrayList<>();
        currentLeaves.add(String.valueOf(tree.info));

        rounds.add(currentLeaves);

        String[] ret = new String[rounds.size()];

        for (int i = 0; i < rounds.size(); i++) {
            ArrayList<String> round = rounds.get(i);
            ret[i] = String.join(" ", round);
        }

        return ret;
    }

    public void findLeaves(TreeNode root, ArrayList<String> currentLeaves) {
        if(root == null) return;

        if(root.left != null && isLeaf(root.left)) {
            currentLeaves.add(String.valueOf(root.left.info));
            root.left = null;
        } else {
            findLeaves(root.left, currentLeaves);
        }

        if(root.right != null && isLeaf(root.right)) {
            currentLeaves.add(String.valueOf(root.right.info));
            root.right = null;
        } else {
            findLeaves(root.right, currentLeaves);
        }
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}