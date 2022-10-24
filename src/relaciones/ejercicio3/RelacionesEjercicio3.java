/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import relaciones.ejercicio3.entidades.Baraja;
import relaciones.ejercicio3.servicios.BarajaServicio;

/**
 *
 * @author GustM_000
 */
public class RelacionesEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaServicio barserv=new BarajaServicio();
        Baraja baraja=barserv.crearBaraja();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("La baraja ha sido creada");
        int opcion=0;
        do {            
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Barajar");
            System.out.println("2. Sacar la carta siguiente");
            System.out.println("3. Dar una cantidad de cartas");
            System.out.println("4. Cantidad de cartas que han salido");
            System.out.println("5. Cantidad de cartas disponibles");
            System.out.println("6. Mostrar cartas disponibles");
            System.out.println("7. Crear nueva baraja completa");
            System.out.println("8. Salir");
            opcion=leer.nextInt();
            switch (opcion) {
                case 1:
                    barserv.barajar(baraja);
                    break;
                case 2:
                    barserv.siguienteCarta(baraja);
                    break;
                case 3:
                    System.out.println("Indicar numero de cartas a dar");
                    int num=leer.nextInt();
                    barserv.darCartas(baraja, num);
                    break;
                case 4:
                    barserv.cartasMonton();
                    break;
                case 5:
                    barserv.cartasDisponibles(baraja);
                    break;
                case 6:
                    barserv.mostrarBaraja(baraja);
                    break;
                case 7:
                    baraja=barserv.crearBaraja();
                    break;
            }
        } while (opcion!=8);
    }
    
}
