import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OverEnrollTest {

    @Test
    void popular() {

        OverEnroll overEnroll = new OverEnroll();

        assertEquals(new String[]{"a:918", "c:25"}, overEnroll.popular(new String[]{"a:b:9", "a:c:8", "a:d:800", "a:e:101", "b:a:11", "b:b:101", "b:d:101", "b:e:222", "c:xx:9", "c:yy:7", "c:zz:5", "c:aa:4"}));

    }
}