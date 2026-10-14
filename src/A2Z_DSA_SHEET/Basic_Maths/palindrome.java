package A2Z_DSA_SHEET.Basic_Maths;

public class palindrome {
    public static boolean palindrome(int x) {
        if (x < 0) return false;

        int original = x;
        long rev = 0;
        while (x > 0) {
            int ld = x % 10;
            rev = (rev * 10) + ld;
            x = x / 10;
        }
        if (original == rev) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String args[]){
        System.out.println(palindrome(292));
    }


}

