package controller;

import model.Atleta;
import model.Time;

import java.util.ArrayList;
import java.util.List;

public class TimeController {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta(1l, "111.111.111-11", "Nathan", "Thompson");
        Atleta atleta2 = new Atleta(2l, "222.222.222-22", "Harry", "Marin");
        Atleta atleta3 = new Atleta(3l, "333.333.333-33", "Toby", "Hastings");

        List <Atleta> atletas = new ArrayList<>();
        atletas.add(atleta1);
        atletas.add(atleta2);
        atletas.add(atleta3);

        Time time = new Time(1l, "Rosewood", "Ohio", atletas);
        System.out.println(time);

        atletas.remove(atleta2);
        System.out.println(time);
    }
}
