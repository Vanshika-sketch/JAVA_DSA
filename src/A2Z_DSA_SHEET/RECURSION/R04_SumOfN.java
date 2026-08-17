package A2Z_DSA_SHEET.RECURSION;

public class R04_SumOfN {
    static int sumOfN(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfN(n-1);
    }
    public static void main(String[] args){
        int n=5;
        System.out.println(sumOfN(n));
    }
}
