package com.mycompany.casa_parte_todo;

public class Habitacion {
    private String tipo;

    public Habitacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
   public void mostrarDetalles() {

    System.out.println("- " + tipo);
}
    
}
