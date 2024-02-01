package expressions.p10;

public class Main {
    public static boolean isLeap(int n){
        return n%400 == 0 || n%100==0 || n%4==0;
    }

    public static void main(String[] args) {
        System.out.println(isLeap(2023));
    }
}
