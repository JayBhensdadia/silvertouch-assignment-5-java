package recursion.p6;

public class Main {
    public static boolean isPalindrome(String str, int i, int j){
        if(i>j) return true;
        return str.charAt(i) == str.charAt(j) && isPalindrome(str,i+1,j-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abdfba",0,3));
    }
}
