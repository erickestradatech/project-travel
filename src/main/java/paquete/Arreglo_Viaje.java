package paquete;

import java.util.*;

public class Arreglo_Viaje {

    private List<Viaje> lista = new ArrayList();

    public void Adi_Viajes(Viaje v) {

        lista.add(v);
    }

    public Pasajero busca(int cod) {

        for (Viaje x : lista) {

            Pasajero p = x.buscaPasajero(cod);

            if (p != null) {

                return p;
            }
        }

        return null;
    }

    public Viaje buscaSeccion(String nom) {

        for (Viaje x : lista) {

            if (x.getRuta().equals(nom)) {

                return x;
            }
        }

        return null;
    }

    public List<Viaje> getLista() {

        return lista;
    }

    public void setLista(List<Viaje> lista) {

        this.lista = lista;
    }

}
