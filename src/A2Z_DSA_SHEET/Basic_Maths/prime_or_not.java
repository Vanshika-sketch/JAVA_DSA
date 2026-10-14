package A2Z_DSA_SHEET.Basic_Maths;

public class prime_or_not {
    public static boolean primeOrNot(int n){
        int cnt =0;
        for (int i=1;i*i<=n;i++){
            if (n%i==0){
                cnt++;
                if ((n%i)!=i){
                    cnt ++;
                }
            }



        }
        if(cnt == 2){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println(primeOrNot(3));
        System.out.println(primeOrNot(4));
        System.out.println(primeOrNot(1));

    }


}
