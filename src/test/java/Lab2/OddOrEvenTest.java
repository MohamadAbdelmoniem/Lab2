package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOrEvenTest {
    @Test
    void TenEven() {
        OddOrEven test1 = new OddOrEven();
        assertEquals(test1.EvenOdd(10),"Even");
    }

    @Test
    void SevenOdd() {
        OddOrEven test2 = new OddOrEven();
        assertEquals(test2.EvenOdd(7),"Odd");
    }

}