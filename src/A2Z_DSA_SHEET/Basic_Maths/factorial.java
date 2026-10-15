package A2Z_DSA_SHEET.Basic_Maths;

public class factorial {
    public static int factorial(int n){
//        if (n==1 || n==0)
//            return 1;
//        return n * factorial(n-1);
//        }

        int result =1;
        for (int i=2;i<=n;i++){
            result=result*i;}
            return result;
        }


    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    }

