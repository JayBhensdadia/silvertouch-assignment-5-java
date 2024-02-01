package loops.p2;

public class Main {
    public static int fact(int n){
        int ans = 1;
        while(n >= 1){
            ans *= n;
            n--;
        }

        return  ans;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
