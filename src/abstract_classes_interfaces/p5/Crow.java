package abstract_classes_interfaces.p5;

public class Crow implements Bird,Flyable{
    @Override
    public void eat() {
        System.out.println("Crow is eating.....");
    }

    @Override
    public void fly() {
        System.out.println("Crow is flying.....");
    }
}
