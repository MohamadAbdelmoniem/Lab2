package Lab2;

public class MinMaxArray {
    int getMax(int[] number) {
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }

    int getMin(int[] number) {
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
        }
        return min;
    }
}
