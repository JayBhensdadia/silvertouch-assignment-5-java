package exceptions.p4;

public class Main {
    void m(){
        int data = 50 / 0;
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception handled at p");
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.p();
    }
}
