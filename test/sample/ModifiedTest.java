package sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModifiedTest {
    @Test
    public void kloppendePlanning() {
        Planning planning = new Planning (true, 0, true);
        assertFalse(planning.kloppendePlanning(false, -10, true));
        assertTrue(planning.kloppendePlanning(true, 20, false));
        assertTrue(planning.kloppendePlanning(true, -15, true));
        assertFalse(planning.kloppendePlanning(false, -19, false));
    }
}
