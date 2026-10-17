package A2Z_DSA_SHEET.ARRAYS;

public class A03_ArrayIsSorted {
    public static boolean isSorted(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            if (arr[i]>=arr[i-1]){

            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr= {5,4,6,7,8};
        System.out.println(isSorted(arr));
    }
}
