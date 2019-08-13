/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2observer;

/**
 *
 * @author Semuret
 */
public class Ejemplo2Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String estado = "vivo";
        Sujeto subject = new Sujeto();
        new Jugador1(subject);
        new Jugador2(subject);
        System.out.println("Los jugadores están observando al boss.");
        subject.setEstado("vivo");
         System.out.println("Los jugadores están peleando contre el boss.");
         subject.setEstado("muerto");
        
    }
    
}
