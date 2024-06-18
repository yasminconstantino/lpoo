package model;

public class Aviao extends Personagem{
    private double z=0;

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Aviao() {
        super();
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Aviao(double x, double y) {
        super(x, y);
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Aviao(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void mover(double x, double y, double z) {
        super.mover(x, y);
        this.z = z;
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public void desenhar() {
        System.out.println("Desenhou um avião");
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public String toString() {
        return "\nAviao [z=" + z + ", x=" + x + ", y=" + y + "]";
    }
}
