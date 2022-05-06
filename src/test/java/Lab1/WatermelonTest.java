package Lab1;

import Lab1.Watermelon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {
    @Test
    void TenKiloYES() {
        Watermelon Watermelon1 = new Watermelon();
        assertEquals("YES", Watermelon1.IsEven(10));
        ;
    }

    @Test
    void ElevenKiloNO() {
        Watermelon Watermelon1 = new Watermelon();
        assertEquals("NO", Watermelon1.IsEven(11));
        ;
    }

    @Test
    void NegativeKiloNO() {
        Watermelon Watermelon1 = new Watermelon();
        assertEquals("NO", Watermelon1.IsEven(-10));
        ;
    }
}