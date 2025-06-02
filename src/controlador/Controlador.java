package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modulo.Modulo;
import vista.Vista;

public class Controlador implements ActionListener {

    private Vista vista;
    private Modulo modulo;

    public Controlador(Vista vista, Modulo modulo) {
        this.vista = vista;
        this.modulo = modulo;
        this.vista.botonAnniadirLista.addActionListener(this);
        this.vista.botonRemoverLista.addActionListener(this);
        this.vista.lista.setText("Lista: " + this.modulo.agregarLista("Uno"));
        this.vista.lista.setText("Lista: " + this.modulo.agregarLista("Dos"));
        this.vista.lista.setText("Lista: " + this.modulo.agregarLista("Tres"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.botonAnniadirLista) {
            this.vista.lista.setText("Lista: " + this.modulo.agregarLista(this.vista.campoTexto.getText()).toString());
            this.vista.campoTexto.setText("");
        } else if (e.getSource() == vista.botonRemoverLista) {
            if (!this.modulo.getLista().isEmpty()) {
                this.vista.lista.setText("Lista: " + this.modulo.removerElementoLista().toString());
                if (this.modulo.getLista().isEmpty()) {
                    this.vista.lista.setText("No hay elementos en la lista");
                }
            } 
        }
    }

}
