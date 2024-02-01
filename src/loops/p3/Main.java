package loops.p3;

public class Main {

    public static void fibbonacci(int n){
        int prev2 = 0;
        int prev1 = 1;
        System.out.println(prev2);
        System.out.println(prev1);
        int count = 2;
        do {
            int next = prev1 + prev2;
            prev2 = prev1;
            prev1 = next;
            System.out.println(next);
            count++;
        }while(count <= n);

    }
    public static void main(String[] args) {
        fibbonacci(6);
    }
}
