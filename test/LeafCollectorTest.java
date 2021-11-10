import org.junit.jupiter.api.Test;
import util.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LeafCollectorTest {

    @Test
    void getLeaves() {

        LeafCollector collector = new LeafCollector();

        TreeNode treeNode = new TreeNode(90);

        treeNode.right = new TreeNode(1);

        assertArrayEquals(new String[]{"1", "90"}, collector.getLeaves(treeNode));

    }
}