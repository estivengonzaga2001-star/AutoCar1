package modelo;

public class Auto extends Vehiculo {

    public Auto(String placa, int autonomia) {
        super(placa, autonomia);
    }

    public Vehiculo clonar() {
        return new Auto(placa, autonomia);
    }
}