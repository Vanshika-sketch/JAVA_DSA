package A2Z_DSA_SHEET.Basic_Maths;

public class Count_all_Digits_of_a_number {
    public static int Count(int n){
        int cnt=0;
        while(n>0){
            int lastDigit=n%10;
            cnt=cnt+1;
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args){
        int n = 224;
        System.out.println(Count(n));
    }
}
