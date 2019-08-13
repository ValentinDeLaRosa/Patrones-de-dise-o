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
public class Jugador2 extends Observador{
    
    public Jugador2(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
        
}

    @Override
    public void actualizar() {
        System.out.println("El boss está: " 
                + sujeto.getEstado());
    }
}
