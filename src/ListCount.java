import util.ListNode;

public class ListCount {
    public int count (ListNode list) {

        int count = 0;

        ListNode current = list;

        while(current != null) {
            current = current.next;
            count++;
        }

        return count;
    }
}