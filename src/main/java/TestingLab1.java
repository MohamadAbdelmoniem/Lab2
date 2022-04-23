public class TestingLab1 {
    int getMax(int[] number){
        int max=number[0];
        for(int i=1;i< number.length;i++){
            if (number[i] > max){
                max=number[i];
            }
        }
        return max;
    }
    int getMin(int[] number){
        int min=number[0];
        for(int i=1;i< number.length;i++){
            if (number[i] < min){
                min=number[i];
            }
        }
        return min;
    }
    float getaverage(int[] number){
        int sum=0;
        float average=0;
        for(int i=0;i< number.length;i++){
            sum+= number[i];
        }
        return average;
    }
}
