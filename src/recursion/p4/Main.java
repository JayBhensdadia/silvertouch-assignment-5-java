package recursion.p4;

public class Main {

    public static int power(int x, int n){
        if(n==1) return x;
        return x * power(x,n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
}
