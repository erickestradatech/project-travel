package paquete;

import java.util.*;
import javax.swing.JTextArea;

public class Viaje {

    private int nroViaje; // Se autogenera desde 101
    private String ruta;
    private double costo;
    private int cant_dis; // Cantida disponible que se va actulizar cada vez que se registra un pasajero.
    private List<Pasajero> lista;

    static int cuenta = 101;

    public Viaje(String ruta, double costo, int cant_dis) {
        this.nroViaje = cuenta++;
        this.ruta = ruta;
        this.costo = costo;
        this.cant_dis = cant_dis;
        this.lista = new ArrayList();
    }

    // Adicionar
    public void Adi_Pasajero(Pasajero p) {

        lista.add(p);
    }

    public void muestra(JTextArea at) {

        at.setText("Ruta: " + ruta + "\tCosto: " + costo + "\tDisponible: " + cant_dis);
        at.append("\nBoleto\tNombre\tTipo\tPago");

        double pg;

        for (Pasajero p : lista) {

            pg = p.pagoPorcentaje() * costo;
            at.append("\n" + p.getBoleto() + "\t" + p.getNombre() + "\t" + p.tipoPasajero() + "\t" + pg);
        }
    }

    public Pasajero buscaPasajero(int cod) {

        for (Pasajero x : lista) {

            if (x.getBoleto() == cod) {

                return x;
            }
        }

        return null;
    }

    public int getNroViaje() {
        return nroViaje;
    }

    public void setNroViaje(int nroViaje) {
        this.nroViaje = nroViaje;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCant_dis() {
        return cant_dis;
    }

    public void setCant_dis(int cant_dis) {
        this.cant_dis = cant_dis;
    }

    public List<Pasajero> getLista() {
        return lista;
    }

    public void setLista(List<Pasajero> lista) {
        this.lista = lista;
    }

}
