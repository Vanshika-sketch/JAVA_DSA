package A2Z_DSA_SHEET.RECURSION;

public class R07_PalindromeCheck {
    static boolean isPalindrome(String s, int left,int right){
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindrome(s,left+1,right-1);
    }
    public static void main(String[] args){
        String s = "hello";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
