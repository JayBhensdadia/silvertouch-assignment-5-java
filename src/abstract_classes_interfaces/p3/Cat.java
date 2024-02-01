package abstract_classes_interfaces.p3;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("cat is eating....");
    }
}
