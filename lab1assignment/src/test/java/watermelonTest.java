import org.junit.Test;

import static org.junit.Assert.*;

public class watermelonTest {

    @Test
    public void ifeven() {
        watermelon watermelon = new watermelon();
        assertEquals(true,watermelon.ifeven(8));
    }
}