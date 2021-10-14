import util.ListNode;

public class MergeLists {
    public ListNode weave (ListNode a, ListNode b) {

        ListNode first =
                new ListNode(
                        a.info,
                        new ListNode(b.info, null)
                );

        ListNode currentRet = first;

        ListNode currentA = a.next;
        ListNode currentB = b.next;

        while(currentA != null) {
            currentRet.next.next =
                    new ListNode(
                            currentA.info,
                            new ListNode(currentB.info, null)
                    );

            currentA = currentA.next;
            currentB = currentB.next;
            currentRet = currentRet.next.next;
        }

        return first;
    }
}