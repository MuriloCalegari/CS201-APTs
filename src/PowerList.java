import util.ListNode;

public class PowerList {
    public ListNode create(int n) {

        if(n == 1) return null;

        ListNode first = new ListNode(1);
        ListNode current = first;

        int pwr = 1;

        while(pwr*2 < n) {
            current.next = new ListNode(pwr*2);
            current = current.next;
            pwr *= 2;
        }


        return first;
    }
}