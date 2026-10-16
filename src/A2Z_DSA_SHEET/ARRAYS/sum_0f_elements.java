package A2Z_DSA_SHEET.ARRAYS;

public class sum_0f_elements {
    public static int sum_of_elements(int[] arr) {


        int sum = 0;
        int n= arr.length;
        for (int i = 0; i < n; i++){
            sum =sum+arr[i];
        }
        return sum;
    }

    static void main(String[] args) {
        int [] arr={2,1,3};
        System.out.println(sum_of_elements(arr));

    }

}
