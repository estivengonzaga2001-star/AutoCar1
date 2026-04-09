package main;

import modelo.*;
import contrato.contrato;

public class Main {
    public static void main(String[] args) {

        Inventario inv = new Inventario();

        Vehiculo v1 = new Auto("A1", 400);
        Vehiculo v2 = new Van("B2", 300);
        Vehiculo v3 = new CamionLigero("C3", 500);

        inv.agregar(v1);
        inv.agregar(v2);
        inv.agregar(v3);

        System.out.println("Inventario:");
        inv.mostrar();

        inv.ordenarPorAutonomia();
        System.out.println("Ordenado:");
        inv.mostrar();

        contrato c = new contrato.Builder()
                .setCliente("Stiven")
                .setVehiculo(v1)
                .setPlan("Mensual")
                .addGPS()
                .build();

        System.out.println("Contrato:");
        c.mostrar();
    }
}