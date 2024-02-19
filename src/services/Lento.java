package services;

import interfaces.Comportamento;

public class Lento implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo lentamente...");
    }

}
