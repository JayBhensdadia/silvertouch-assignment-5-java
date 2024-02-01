package string_processing.p3;

public class Main {

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while (i <= j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdba"));
        System.out.println(isPalindrome("abcba"));

    }

}
