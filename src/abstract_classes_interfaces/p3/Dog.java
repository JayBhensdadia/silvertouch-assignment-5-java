package abstract_classes_interfaces.p3;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("bhow bhow");
    }

    @Override
    public void eat() {
        System.out.println("dog is eating.....");
    }
}
