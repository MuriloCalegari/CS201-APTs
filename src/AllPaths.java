import util.TreeNode;

import java.util.ArrayList;
import java.util.Comparator;

public class AllPaths {

    private ArrayList<String> paths;

    public String[] paths(TreeNode t) {

        paths = new ArrayList<>();

        if(t != null && t.left == null && t.right == null) {
            paths.add(String.valueOf(t.info));
        } else if(t != null) {
            findPath(t.left, String.valueOf(t.info));
            findPath(t.right, String.valueOf(t.info));
        }

        paths.sort(Comparator.naturalOrder());

        String[] ret = new String[paths.size()];

        for (int i = 0; i < paths.size(); i++) {
            String path = paths.get(i);

            ret[i] = path;
        }

        return ret;
    }

    public void findPath(TreeNode node, String pathSoFar) {

        if(node == null) return;

        if(node.left == null && node.right == null) {
            pathSoFar = pathSoFar + "->" + node.info;
            paths.add(pathSoFar);
        }

        if(node.left != null) {
            findPath(node.left, pathSoFar + "->" + node.info);
        }

        if(node.right != null) {
            findPath(node.right, pathSoFar + "->" + node.info);
        }
    }


}