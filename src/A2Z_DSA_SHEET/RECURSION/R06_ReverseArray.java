package A2Z_DSA_SHEET.RECURSION;

public class R06_ReverseArray {
    static void reverse(char[] arr, int left,int right){
        if(left>=right){
            return;
        }
        char temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverse(arr,left+1,right-1);
    }
    public static void main(String[] args){
        char[] arr = {'h','e','l','l','o'};
        reverse(arr,0,arr.length-1);
        System.out.println(new String(arr));
    }
}
