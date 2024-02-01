package recursion.p10;

public class Main {
    public static int nthFibb(int n){
        if(n==1 || n==2) return 1;
        return nthFibb(n-1) + nthFibb(n-2);
    }

    public static void main(String[] args) {
        System.out.println(nthFibb(6));
    }
}
