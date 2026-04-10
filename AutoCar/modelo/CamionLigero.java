package modelo;

public class CamionLigero extends Vehiculo {

    public CamionLigero(String placa, int autonomia) {
        super(placa, autonomia);
    }

    public Vehiculo clonar() {
        return new CamionLigero(placa, autonomia);
    }
}