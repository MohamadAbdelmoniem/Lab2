public class Vasya {
    public static String ISEqu(int[][] Allforces){
        int []sumF=new int[3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                sumF[j]+=Allforces[i][j];
            }
        }
        if (sumF[0]==0 && sumF[1]==0 && sumF[2]==0) {
            return "YES";
        }
        else{
            return "NO";
        }
        }
    }
