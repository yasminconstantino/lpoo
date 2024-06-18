package controller;

import java.util.ArrayList;
import java.util.List;

import model.Animal;
import model.Cachorro;
import model.Passaro;
import model.Peixe;

public class AnimalController {
    public static void main (String[] args) {
        Peixe peixe1 = new Peixe(1,0);
        Peixe peixe2 = new Peixe(0,1);
        Peixe peixe3 = new Peixe(1,1);
        Passaro passaro1 = new Passaro(0,2);
        Passaro passaro2 = new Passaro(2,0);
        Passaro passaro3 = new Passaro(2,2);
        Cachorro cachorro1 = new Cachorro(0,3);
        Cachorro cachorro2 = new Cachorro(3,0);
        Cachorro cachorro3 = new Cachorro(3,3);

        List < Animal> animals = new ArrayList();
        animals.add(peixe1);
        animals.add(peixe2);
        animals.add(peixe3);
        animals.add(passaro1);
        animals.add(passaro2);
        animals.add(passaro3);
        animals.add(cachorro1);
        animals.add(cachorro2);
        animals.add(cachorro3);
        System.out.println(animals);

        System.out.print("\n\n(Resposta 1c) Animais movidos para a coordenada x=2.0 e y=2.0");
        animals.forEach(a -> {
            a.mover(2.0, 2.0); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
            a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
            System.out.print(a);
        });

        System.out.print("\n\n(Resposta 1d) Animais da classe Cachorro movidos para a coordenada x=8.0 e y=8.0");
        animals.forEach(a -> {
            if(a instanceof Cachorro) {
                a.mover(8.0, 8.0); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
                a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
                System.out.print(a);
            }
        });

        System.out.print("\n\n(Resposta d) Animais da classe Peixe e Passaro movidos para a coordenada x=5.0, y=5.0, z=5.0");
        animals.forEach(a -> {
            if(a instanceof Peixe) {
                //((Peixe) a) faz um Downcasting da classe Animal para a classe Peixe, assim tem acesso ao método mover com três argumentos
                ((Peixe) a).mover(5.0, 5.0, 5.0); //chama o método mover() específico da classe Peixe (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
                a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
                System.out.print(a);
            } else if(a instanceof Passaro) {
                if(a instanceof Passaro) {
                    //((Passaro) a) faz um Downcasting da classe Animal para a classe Passaro, assim tem acesso ao método mover com três argumentos
                    ((Passaro) a).mover(5.0, 5.0, 5.0); //chama o método mover() específico da classe Passaro (que não sobreescreve o mover da superclasse, pois tem outra assintaura)
                    a.desenhar(); //utiliza o Polimorfismo Universal - Paramétrico (ou sobreescrita)
                    System.out.print(a);
                }
            }
        });

    }
}
