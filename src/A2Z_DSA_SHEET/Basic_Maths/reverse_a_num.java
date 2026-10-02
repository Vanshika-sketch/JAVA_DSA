package A2Z_DSA_SHEET.Basic_Maths;

public class reverse_a_num {
    public static int reverse(int x) {
        long revNum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            revNum = revNum * 10 + lastDigit;
            x = x / 10;
        }

        if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) revNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-240));        // -42
        System.out.println(reverse(1534236469));  // 0
    }
}