package A2Z_DSA_SHEET.ARRAYS;

public class count_odd_numbers_in_array {
    public static int oddNum(int[] arr){
        int n= arr.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                cnt++;
            }
        }
        return cnt;


    }

    static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,1,1,5,1};
        System.out.println(oddNum(arr1));
        System.out.println(oddNum(arr2));
    }
}
