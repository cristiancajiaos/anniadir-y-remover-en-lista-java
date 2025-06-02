package main;

import controlador.Controlador;
import modulo.Modulo;
import vista.Vista;

public class Main {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modulo modulo = new Modulo();
        Controlador controlador = new Controlador(vista, modulo);
        
        vista.setVisible(true);
    }
}
