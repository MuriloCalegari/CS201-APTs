import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalityTest {

    @Test
    void sum() {

        Totality t = new Totality();

        assertEquals(0 + 2 + 3, t.sum(new int[]{0, 1, 2, 3, 4},  "odd"));

    }
}