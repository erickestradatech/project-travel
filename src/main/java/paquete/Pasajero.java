package paquete;

public class Pasajero {

    private int boleto; // Numero de boleto se autogenera desde 1
    private String nombre;
    private int tipo; // 1=niño, 2=estudiante, 3=adulto
    private Viaje via;

    static int cuenta = 1;

    public Pasajero(String nombre, int tipo, Viaje via) {
        this.boleto = cuenta++;
        this.nombre = nombre;
        this.tipo = tipo;
        this.via = via;
        via.Adi_Pasajero(this);
        via.setCant_dis(via.getCant_dis() - 1);
    }

    // Tipo de pasajero seleccionado en un comboBox
    public String tipoPasajero() {

        String v[] = {"", "Niño", "Estudiante", "Adulto"};
        return v[tipo];
    }

    // Que porcentaje de descuento le correspondera a cada tipo de pasajero
    public double pagoPorcentaje() {

        double v[] = {0, 0.5, 0.7, 1};
        return v[tipo];
    }

    // El pago que realizara cada pasajero
    public double pago() {

        return pagoPorcentaje() * via.getCosto();
        // via.getCosto(): Acceder al costo de la clase viaje
    }

    public int getBoleto() {
        return boleto;
    }

    public void setBoleto(int boleto) {
        this.boleto = boleto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Viaje getVia() {
        return via;
    }

    public void setVia(Viaje via) {
        this.via = via;
    }

}
