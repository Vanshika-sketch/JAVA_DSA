package A2Z_DSA_SHEET.SORTING;

public class S01_selection_sort {
    public static void selection_sort(int[] arr){
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //swap
            if(minIndex != i){
                int temp=arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }
    public static void main(String[] args){
        int arr[]={29,10,14,31,13};
        System.out.println("Before Sorting:");
        printArray(arr);

        selection_sort(arr);

        System.out.println("after sorting:");
        printArray(arr);
    }
    private static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
