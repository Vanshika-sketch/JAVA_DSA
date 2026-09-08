package LEETCODE;

public class Q189_RotateArray {
    public static void rotateArray(int[]arr, int k){

        int n= arr.length;
        int[] tempArr = new int[n];
        for(int i=0;i<n;i++){
            tempArr[(i+k)%n]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=tempArr[i];
        }



    }
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5,6};
        rotateArray(arr,3);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
