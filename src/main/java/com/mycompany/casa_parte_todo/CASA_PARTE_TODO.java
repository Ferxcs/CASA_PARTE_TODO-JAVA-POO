package com.mycompany.casa_parte_todo;

public class CASA_PARTE_TODO {

    public static void main(String[] args) {
        System.out.println("CIUDAD JARDIN");
        
        Casa casaDeJuan = new Casa("Av.unam mz12-lt23");
        casaDeJuan.mostrar_info();
        
        Casa casaDePedro = new Casa("Av.unam mz13-lt4");
        casaDePedro.mostrar_info();
    }
}
