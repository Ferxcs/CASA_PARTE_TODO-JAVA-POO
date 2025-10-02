package com.mycompany.casa_parte_todo;
import java.util.ArrayList;
import java.util.List;

public class Casa {
    private String direccion;
    private List<Habitacion> habitaciones;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        
        habitaciones.add(new Habitacion("Dormitorio"));
        habitaciones.add(new Habitacion("Cocina"));
        habitaciones.add(new Habitacion("Banio"));
    }
    
    public void mostrar_info() {
        System.out.println("============== Detalles de la Casa ==============");
        System.out.println("Direccion: " +  direccion);
        
        System.out.println("Habitaciones: ");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarDetalles(); 
        }
     }  
}
    

