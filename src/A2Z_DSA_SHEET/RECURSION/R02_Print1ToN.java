package A2Z_DSA_SHEET.RECURSION;

public class R02_Print1ToN {
    static void print1ToN(int i,int n){

        if(i>n){
            return;
        }
        System.out.println(i);
        print1ToN(i+1,n);
    }
    public static void main(String[] args){
        int n=5;
        print1ToN(1,n);
    }
}
