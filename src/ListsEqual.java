import util.ListNode;

public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {

        int isEqual = 0;

        ListNode currentA1 = a1;
        ListNode currentA2 = a2;

        // If only one of the two is null, we can return 0 immediately
        if(currentA1 == null ^ currentA2 == null) return 0;

        while(currentA1 != null) {
            if(currentA1.info != currentA2.info) return 0;

            // If one has a subsequent node but the other doesn't,
            // then the nodes have different sizes and therefore are not equal
            if(currentA1.next == null ^ currentA2.next == null) return 0;

            currentA1 = currentA1.next;
            currentA2 = currentA2.next;
        }

        return 1;
    }
}