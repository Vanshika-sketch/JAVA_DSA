package A2Z_DSA_SHEET.PATTERN;

public class P06_InvertedNumberTriangle {
    public static void main(String[] args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
