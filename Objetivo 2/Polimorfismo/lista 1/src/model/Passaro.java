package model;

public class Passaro extends Animal {
    protected double z=0;

    public Passaro(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Passaro(double x, double y) {
        super(x, y);
    }


    public Passaro() {

    }

    public void mover (double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPassaro{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
