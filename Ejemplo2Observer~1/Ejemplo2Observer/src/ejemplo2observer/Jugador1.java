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
public class Jugador1 extends Observador{
     
    public Jugador1(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
        
}

    @Override
    public void actualizar() {
        System.out.println("el boss está: " 
                + sujeto.getEstado());
    }
}
