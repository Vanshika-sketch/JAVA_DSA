package A2Z_DSA_SHEET.ARRAYS;

public class A02_secondLargest {
    public static int SecondLargest(int[] arr) {

        int second = Integer.MIN_VALUE;
        int largest = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
        }
        public static int secondSmall(int[] arr){
        int small = arr[0];
        int ssmall=Integer.MAX_VALUE;
        int n= arr.length;

        for(int i =1;i<n;i++){
            if (arr[i]<small){
                ssmall=small;
                small=arr[i];
            } else if (arr[i]>small && arr[i]<ssmall) {
                ssmall=arr[i];
            }
        }
        return ssmall;
    }
    public static void main(String[] args){
        int[] arr={22,45,65,73,76};
        System.out.println(SecondLargest(arr));
        System.out.println(secondSmall(arr));




    }

}
