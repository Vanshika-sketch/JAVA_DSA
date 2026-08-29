package A2Z_DSA_SHEET.ARRAYS;

public class A04_remove_Duplicate_from_Sorted_array {
    public static  int removeDuplicate(int[] arr) {
        int n= arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;


    }
    public static void main(String[] args){
        int arr[] = {1,1,2,2,2,3,4,4};
//        System.out.println(removeDuplicate(arr));
        int result = removeDuplicate(arr);
        for(int idx = 0;idx<result;idx++){
            System.out.print(arr[idx] + " ");
        }
    }
}
