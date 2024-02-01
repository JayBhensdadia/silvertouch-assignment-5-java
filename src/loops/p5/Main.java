package loops.p5;

public class Main {

    public static boolean isPrime(int n){
        int i = 2;
        while(i < n){
            if(n % i==0){
                return false;
            }
            i++;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}
