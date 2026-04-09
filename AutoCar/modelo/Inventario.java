package modelo;

public class Inventario {
    private Vehiculo[] vehiculos = new Vehiculo[100];
    private int contador = 0;

    public void agregar(Vehiculo v) {
        vehiculos[contador] = v;
        contador++;
    }

    public Vehiculo buscar(String placa) {
        for (int i = 0; i < contador; i++) {
            if (vehiculos[i].getPlaca().equals(placa)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    public void ordenarPorAutonomia() {
        for (int i = 0; i < contador - 1; i++) {
            for (int j = 0; j < contador - i - 1; j++) {
                if (vehiculos[j].getAutonomia() > vehiculos[j + 1].getAutonomia()) {
                    Vehiculo aux = vehiculos[j];
                    vehiculos[j] = vehiculos[j + 1];
                    vehiculos[j + 1] = aux;
                }
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < contador; i++) {
            System.out.println(vehiculos[i]);
        }
    }
}
