import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VasyaTest {
    @Test
    void Test1() {
        Vasya Vasya_1 = new Vasya();
        int arr1[][] = {{3,-1,7}, {-5,2,-4}, {2,-1,-3}};
        assertEquals("YES", Vasya.ISEqu(arr1));
    }

    @Test
    void Test2() {
        Vasya Vasya_1 = new Vasya();
        int arr1[][] = {{4, 1, 7}, {-2, 4, -1}, {1, -5, -3}};
        assertEquals("NO", Vasya.ISEqu(arr1));
    }
}