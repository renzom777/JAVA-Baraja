/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones.ejercicio3.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import relaciones.ejercicio3.entidades.Baraja;
import relaciones.ejercicio3.entidades.Carta;
import relaciones.ejercicio3.enumeraciones.Palo;

/**
 *
 * @author GustM_000
 */
public class BarajaServicio {

    private ArrayList<Carta> monton;

    public BarajaServicio() {
        monton = new ArrayList<>(0);
    }

    public Baraja crearBaraja() {
        ArrayList<Carta> mazo = new ArrayList();
        for (Palo aux : Palo.values()) {
            for (int i = 0; i < 12; i++) {
                Carta carta = new Carta(i + 1, aux);
                mazo.add(carta);
            }
        }
        return new Baraja(mazo);
    }

    public void barajar(Baraja b) {
        ArrayList<Carta> mazo = b.getCartas();
        Collections.shuffle(mazo);
        b.setCartas(mazo);
    }

    public void siguienteCarta(Baraja b) {
        ArrayList<Carta> mazo = b.getCartas();
        Iterator<Carta> it = mazo.iterator();
        if (it.hasNext()) {
            Carta carta = it.next();
            System.out.println(carta);
            monton.add(carta);
            it.remove();
        } else {
            System.out.println("No hay mas cartas");
        }
        b.setCartas(mazo);
    }

    public void cartasDisponibles(Baraja b) {
        System.out.println(b.getCartas().size());
    }

    public void darCartas(Baraja b, int num) {
        ArrayList<Carta> aaa=b.getCartas();
        if (aaa.size() > num) {
            ArrayList<Carta> mazo = b.getCartas();
            Iterator<Carta> it = mazo.iterator();
            int i = 0;
            while (it.hasNext()) {
                i++;
                Carta carta = it.next();
                if (i <= num) {
                    System.out.println(carta);
                    it.remove();
                    monton.add(carta);
                } else {
                    break;
                }
            }
            b.setCartas(mazo);
        } else {
            System.out.println("No hay suficientes cartas");
        }
    }

    public void cartasMonton() {
        System.out.println("Han salido " + monton.size() + " cartas");
    }

    public void mostrarBaraja(Baraja b) {
        for (Carta carta : b.getCartas()) {
            System.out.println(carta);
        }
    }
}
