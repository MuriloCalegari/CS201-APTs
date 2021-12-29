//import util.ListNode;

public class ListShift {
    public ListNode shift(ListNode start, int key) {

        ListNode first = start;
        ListNode current = start;
        ListNode firstShifted = null;
        ListNode currentShifted = null;

        while(current != null) {

            if(current.info <= key) {
                if(first == start && current.next != null) {
                    first = current.next;
                }

                if(firstShifted == null) {
                    firstShifted = current;
                } else {
                    currentShifted.next = current;
                }
                currentShifted = current;

            }


                /*
            if(current.next.info <= key) {
                if(first == start) {
                    ListNode dumb = current.next.next;
                    first = current.next;
                    lastModified = current.next;
                    lastModified.next = start;
                    current.next = dumb;
                    continue;
                } else {
                    ListNode dumb = current.next.next;
                    lastModified.next = current.next;
                    lastModified = current.next;
                    lastModified.next = start;
                    current.next = dumb;
                    continue;
                }


            }
*/
            if(current.next == null) {
                current.next = firstShifted;
                //currentShifted.next = null;
                break;
            }
            current = current.next;
        }

        return first;
    }
}