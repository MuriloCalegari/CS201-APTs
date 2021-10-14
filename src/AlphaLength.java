import util.ListNode;

import java.util.Arrays;
import java.util.TreeSet;

public class AlphaLength {
    public ListNode create (String[] words) {

        TreeSet<String> wordsSet = new TreeSet<>(Arrays.asList(words));

        ListNode first = null;
        ListNode current = null;

        for(String word: wordsSet) {
            if(first == null) {
                first = new ListNode(word.length(), null);
                current = first;
            } else {
                current.next = new ListNode(word.length(), null);
                current = current.next;
            }
        }

        return first;
    }
}