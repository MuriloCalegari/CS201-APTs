import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicWordsTest {

    @Test
    void countPairs() {
    }

    @Test
    void iso() {

        IsomorphicWords iso = new IsomorphicWords();

        assertEquals("ababcba", iso.iso("xgxgygx"));

    }
}