package abstract_classes_interfaces.p4;

public class ResizableCircle implements Resizable {
    int radius;
    public ResizableCircle(int r){
        this.radius = r;
    }

    @Override
    public void resize(int r) {
        this.radius = r;
        System.out.println("radius changed...");
    }
}
