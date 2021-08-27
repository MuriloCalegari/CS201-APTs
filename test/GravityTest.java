import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GravityTest {

    @Test
    void falling() {
        Gravity g = new Gravity();

        System.out.println(g.falling(3, 10));
    }
}