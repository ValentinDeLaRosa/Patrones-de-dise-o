package observadores;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semuret
 */
public class Cobre extends Observador {
    private double valorCobre = 43.2;
    public Cobre(Sujeto sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
        
}

    @Override
    public void actualizar() {
        System.out.println("oro a cobre:" 
                + sujeto.getValor()*valorCobre);
    }
}
