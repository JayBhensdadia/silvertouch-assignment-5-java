package expressions.p5;

public class Main {

    public static boolean isEven(int n){
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 4;
        if(isEven(n)){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
