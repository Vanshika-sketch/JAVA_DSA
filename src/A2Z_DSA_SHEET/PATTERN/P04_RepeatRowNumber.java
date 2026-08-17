package A2Z_DSA_SHEET.PATTERN;

public class P04_RepeatRowNumber {
    public static void main(String[] args){
        int n= 5;
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
