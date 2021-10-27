import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SyllableSortingTest {

    @Test
    void sortWords() {

        SyllableSorting sorting = new SyllableSorting();

        assertArrayEquals(new String[]{"gawayama", "yamagawa", "xiaoxiao" }, sorting.sortWords(new String[]{"xiaoxiao", "yamagawa", "gawayama"}));
        assertArrayEquals(new String[]{"badne", "baarne"}, sorting.sortWords(new String[]{"baarne", "badne"}));
        assertArrayEquals(new String[]{"bubua", "buabu"}, sorting.sortWords(new String[]{"buabu", "bubua"}));
        assertArrayEquals(new String[]{"ba", "baca"}, sorting.sortWords(new String[]{"ba", "baca"}));
    }
}