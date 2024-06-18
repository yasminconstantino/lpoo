package model;

public abstract class Animal {
    protected double x=0, y=0;

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Animal() {
    }

    public void mover (double x, double y){
        this.x = x;
        this.y = y;
    }

    public void desenhar (){

    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
