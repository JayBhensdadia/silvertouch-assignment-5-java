package recursion.p8;

public class Main {
    public static int sumTillN(int n){
        if(n==1) return 1;
        return n + sumTillN(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumTillN(10));
    }
}
