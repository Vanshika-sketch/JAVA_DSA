package A2Z_DSA_SHEET.ARRAYS;

import java.util.Arrays;

public class A09_Reverse_an_array {
    public static void reverse(int[] arr){
        int n=arr.length;
        int start=0;
        int end= n-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;

        }


    }

    static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
