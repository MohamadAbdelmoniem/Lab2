package Lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxArrayTest {
    @Test
    void TenMaxOneMin() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        MinMaxArray test1 = new MinMaxArray();
        assertEquals(test1.getMax(arr1), 10);
        assertEquals(test1.getMin(arr1), 1);
    }

    @Test
    void FiftyMaxZeroMin() {
        int arr1[] = {10, 7, 28, 2, 5, 46, 49, 13, 50, 0};
        MinMaxArray test2 = new MinMaxArray();
        assertEquals(test2.getMax(arr1), 50);
        assertEquals(test2.getMin(arr1), 0);

    }
}