package application;

import interfaces.Comportamento;
import services.Lento;
import services.Normal;
import services.Rapido;
import strategy.Robo;

public class Program {
    public static void main(String[] args) {
        Comportamento lento = new Lento();
        Comportamento normal = new Normal();
        Comportamento rapido = new Rapido();

        Robo robo = new Robo();
        robo.setComportamento(rapido);
        robo.mover();
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(lento);
        robo.mover();
        robo.mover();
    }
}
