package A2Z_DSA_SHEET.ARRAYS;

public class A06_LinearSearch {
    public static int linearSearch(int[] arr,int target){
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        int[] arr={6,7,8,4,11};
//        linearSearch(arr,4);
        System.out.println(linearSearch(arr,4));

    }
}
