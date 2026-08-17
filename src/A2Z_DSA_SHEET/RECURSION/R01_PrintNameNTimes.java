package A2Z_DSA_SHEET.RECURSION;

public class R01_PrintNameNTimes {
    static void printName(int n){
        if (n == 0 ){
            return;
        }
        System.out.println("Vanshika");
        printName(n-1);

    }
    public static void main(String[] args){
        int n= 5;
        printName(n);
    }
}
