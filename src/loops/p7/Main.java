package loops.p7;

public class Main {

    public static void printMultiplicationTable(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + i*j + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable(2);
    }
}
