package services;

import interfaces.Comportamento;

public class Rapido implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo rapidamente...");
    }
}
