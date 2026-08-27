package A2Z_DSA_SHEET.ARRAYS;

public class A01_LargestElementInArray {
    public static int LargestElement(int[] arr) {

        int largest = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};
        System.out.println(LargestElement(arr));
    }
}
