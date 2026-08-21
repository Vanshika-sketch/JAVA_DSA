package LEETCODE;

public class Q509_FibonacciNumber {
    public static int fibRecursive(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibRecursive(n-1) +fibRecursive(n-2);
    }
    public static int fibIter(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int prev =0;
        int curr=1;
        for (int i=2;i<=n;i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(fibRecursive(n));
        System.out.println(fibIter(n));
    }
}
