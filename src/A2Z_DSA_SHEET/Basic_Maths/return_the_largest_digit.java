package A2Z_DSA_SHEET.Basic_Maths;

public class return_the_largest_digit {
    public static int largest(int n){
        int large =0;
        while(n>0){
            int ld = n%10;
            large  = Math.max(large,ld);
            n=n/10;

        }
        return large;

    }

    static void main(String[] args) {
        System.out.println(largest(-43));

    }
}
