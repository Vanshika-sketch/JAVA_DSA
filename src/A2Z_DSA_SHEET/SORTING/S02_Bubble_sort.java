package A2Z_DSA_SHEET.SORTING;

import java.util.Arrays;

public class S02_Bubble_sort {
    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for (int i=0;i<n-1;i++){
            boolean swapped =false;
            for(int j=0;j<n-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]= temp;
                    swapped=true;

                }
            }
            if(!swapped) break;
        }

    }
    public static void main(String[] args){
        int arr[] = {2,54,23,65,34};

        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
