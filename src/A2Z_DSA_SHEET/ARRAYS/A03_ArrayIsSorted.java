package A2Z_DSA_SHEET.ARRAYS;

public class A03_ArrayIsSorted {
    public static Boolean isSorted(int[] arr){
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
        int[] arr= {1,2,3,4,5};
        System.out.println(isSorted(arr));
    }
}
