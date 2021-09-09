import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigWordTest {

    @Test
    void most() {

        BigWord bigWord = new BigWord();

        assertEquals("fish", bigWord.most(new String[]{"one fish two", "fish red fish blue", "fish this fish is black"}));

    }
}