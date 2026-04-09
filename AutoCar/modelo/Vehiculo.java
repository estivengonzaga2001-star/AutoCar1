package modelo;

public abstract class Vehiculo {
    protected String placa;
    protected int autonomia;

    public Vehiculo(String placa, int autonomia) {
        this.placa = placa;
        this.autonomia = autonomia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public abstract Vehiculo clonar();

    public String toString() {
        return "Placa: " + placa + " | Autonomía: " + autonomia;
    }
}