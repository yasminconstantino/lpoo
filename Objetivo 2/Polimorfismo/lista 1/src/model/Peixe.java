package model;

public class Peixe extends Animal{
    protected double z=0;

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public Peixe(double x, double y) {
        super(x, y);
    }


    public Peixe() {

    }

    //@Override
    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
