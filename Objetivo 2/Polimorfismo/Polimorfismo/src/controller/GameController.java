package controller;

import java.util.*;
import model.Aviao;
import model.Navio;
import model.Personagem;
import model.Tanque;

public class GameController {
    public static void main(String[] args) {
        //sobrecarga de metodos, com subclasses
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao(0, 5,6);
        Navio navio1 = new Navio();
        Navio navio2 = new Navio(5, 1);
        Tanque tanque1 = new Tanque();
        Tanque tanque2 = new Tanque(3,6);

        //tipo generico, sempre na superclasse
        List < Personagem> personagens = new ArrayList();
        personagens.add(aviao1);
        personagens.add(aviao2);
        personagens.add(navio1);
        personagens.add(navio2);
        personagens.add(tanque1);
        personagens.add(tanque2);
        System.out.println("Posições iniciais e personagens");
        System.out.println(personagens);


        personagens.forEach(p) -> {
            p.desenhar(); //sobreescrita de metodos
            if(p instanceof Aviao){
                ((Aviao)p).mover(2,2,8); //downcasting qnd for necessario
            } else if (p instanceof Navio) {
                p.mover(6,4);
            } else if (p instanceof Tanque){
                p.mover(5, 8);
            }
        };

        System.out.println("Nova posição dos personagens");
        System.out.println(personagens);

    }
}
