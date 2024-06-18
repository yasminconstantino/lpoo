package model;

public class Personagem {

    protected double x=0, y=0;

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Personagem() {
        super();
    }

    //Polimorfismo Ad Hoc - Overloading (ou sobrecarga)
    public Personagem(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // era p ser abstract
    public void desenhar(){

    }

    @Override //Polimorfismo Universal - Paramétrico (ou sobreescrita)
    public String toString() {
        return "\n¬Personagem [x=" + x + ", y=" + y + "]";
    }
}
