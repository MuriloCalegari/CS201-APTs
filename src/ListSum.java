import util.ListNode;

public class ListSum {
    public int sum(ListNode list, int thresh) {

        int res = 0;
        ListNode current = list;

        while(current != null) {
            if(current.info > thresh) {
                res += current.info;
            }

            current = current.next;
        }

        return res;
    }
}