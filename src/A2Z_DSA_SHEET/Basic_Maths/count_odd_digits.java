package A2Z_DSA_SHEET.Basic_Maths;

public class count_odd_digits {
    public static int countOdd(int n){
        int cnt=0;
        while(n>0){
            int digit =n%10;
            if(digit %2 != 0 ){
                cnt++;

            }
            n=n/10;
        }
        return cnt;
    }
    public static void main(String[] args){

        System.out.println(countOdd(342567));
    }

}
