package A2Z_DSA_SHEET.Basic_Maths;

public class print_all_divisions {
    public static void divisions(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }

    public static void main(String args[]) {
        divisions(36);
        divisions(12);
    }
}