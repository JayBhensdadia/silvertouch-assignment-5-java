package loops.p4;

public class Main {

    public static int sumTill50(){
        int sum = 0;
        for (int i = 2; i <= 50; i++) {
            if(i%2==0){sum+=i;}
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumTill50());
    }
}
