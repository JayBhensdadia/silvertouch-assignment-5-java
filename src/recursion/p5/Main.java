package recursion.p5;

public class Main {
    public static String reverseStr(String str){
        if(str.length() <= 1) return str;
        return reverseStr(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("jay"));
    }
}
