package contrato;

import modelo.Vehiculo;

public class contrato {
    private String cliente;
    private Vehiculo vehiculo;
    private String plan;
    private boolean gps;
    private boolean seguro;
    private boolean cargador;

    private contrato() {}

    public void mostrar() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehiculo: " + vehiculo);
        System.out.println("Plan: " + plan);
        System.out.println("GPS: " + gps);
        System.out.println("Seguro: " + seguro);
        System.out.println("Cargador: " + cargador);
    }

    public static class Builder {
        private contrato contrato = new contrato();

        public Builder setCliente(String cliente) {
            contrato.cliente = cliente;
            return this;
        }

        public Builder setVehiculo(Vehiculo vehiculo) {
            contrato.vehiculo = vehiculo;
            return this;
        }

        public Builder setPlan(String plan) {
            contrato.plan = plan;
            return this;
        }

        public Builder addGPS() {
            contrato.gps = true;
            return this;
        }

        public Builder addSeguro() {
            contrato.seguro = true;
            return this;
        }

        public Builder addCargador() {
            contrato.cargador = true;
            return this;
        }

        public contrato build() {
            return contrato;
        }
    }
}