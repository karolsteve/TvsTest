import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by steve.tchatchouang
 */
class MainTest {

    @Test
    void addThree() {
        int toTest = 5;
        assertEquals(Main.addThree(toTest), toTest + 3);
    }

    @Test
    void addThreeLocal() {
        Main main = new Main();
        assertEquals(5 + 3, main.addThreeLocal(5));
    }
}