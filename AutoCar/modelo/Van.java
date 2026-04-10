package modelo;

public class Van extends Vehiculo {

    public Van(String placa, int autonomia) {
        super(placa, autonomia);
    }

    public Vehiculo clonar() {
        return new Van(placa, autonomia);
    }
}