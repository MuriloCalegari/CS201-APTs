import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ListShiftTest {

    @Test
    void shift() {

        ListNode testNode;
        testNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, null))))))));

        testNode = new ListNode(1, new ListNode(2));

        ListShift listShift = new ListShift();
        listShift.shift(testNode, -1);

    }
}