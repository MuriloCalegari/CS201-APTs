import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DNAMaxNucleotideTest {

    @Test
    void max() {

        DNAMaxNucleotide dna = new DNAMaxNucleotide();

        //assertEquals("taattt", dna.max(new String[]{"agt", "aagt", "taattt", "ccatg"}, "a"));
        assertEquals("", dna.max(new String[]{"aaa", "gggg", "ttttt", "t" }, "c"));

    }
}