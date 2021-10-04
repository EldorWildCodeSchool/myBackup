package wildcodeschool.quests.Exceptions01.Exception_handling;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OddSumTest {

    @Test
    public void testTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testOdds1() throws Exception {
        String[] in = {"1", "2", "3", "4", "5", "6"};
        assertEquals(9, OddSum.run(in, true));
    }

    @Test
    public void testOdds2() throws Exception {
        String[] in = {"1", "20", "31", "45", "52", "61"};
        assertEquals(138, OddSum.run(in, true));
    }
    @Test
    public void testException() throws Exception {
        String[] in = {"1", "2", "3", "4", "5", "a"};
        assertEquals(-1, OddSum.run(in, true));
    }

}