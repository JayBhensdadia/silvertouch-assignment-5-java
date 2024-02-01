package recursion.p3;

public class Main {

    public static int digiSum(int n){
        if(n<10) return n;

        return n%10 + digiSum(n/10);
    }

    public static void main(String[] args) {
        System.out.println(digiSum(123));
    }
}
