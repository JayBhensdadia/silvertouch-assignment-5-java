package string_processing.p2;

public class Main {
    public static String reverse(String str){
        if (str.length() <= 1){ return str; }
        String temp = reverse(str.substring(1));
        return temp + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("hi there"));
    }
}
