import util.ListNode;

public class ListMutation {
    public ListNode alter(ListNode list) {

        if(list == null) return null;

        if(list.info % 2 != 0 && list.next == null) return null;

        if(list.info % 2 != 0 & list.next != null) {
            return alter(list.next);
        }

        list.next = alter(list.next);

        ListNode duplicate = new ListNode(list.info);
        duplicate.next = list.next;

        list.next = duplicate;

        return list;
    }
}