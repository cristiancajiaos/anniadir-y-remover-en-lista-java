package modulo;

import java.util.List;
import java.util.ArrayList;

public class Modulo {

    private List<String> lista = new ArrayList<>();
    
    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public List<String> agregarLista(String texto) {
        this.lista.add(texto);
        return lista;
    }

    public List<String> removerElementoLista() {
        this.lista.remove(0);
        return lista;
    }

}
