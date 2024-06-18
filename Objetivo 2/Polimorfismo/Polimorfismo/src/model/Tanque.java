package model;

public class Tanque extends Personagem{
    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Tanque() {
        super();
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Tanque(double x, double y) {
        super(x, y);
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public void desenhar() {
        System.out.println("Desenhou um tanque.");
    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public String toString() {
        return "\nTanque [x=" + x + ", y=" + y + "]";
    }
}
