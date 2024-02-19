package services;

import interfaces.Comportamento;

public class Normal implements Comportamento{

    public void mover() {
        System.out.println("Movendo normalmente...");
    }
}
