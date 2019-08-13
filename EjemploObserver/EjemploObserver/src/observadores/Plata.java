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
public class Plata extends Observador{
    private double valorPlata = 18;

    public Plata(Sujeto sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	@Override
	public void actualizar() {		
		System.out.println("Oro a plata: "
                        + (sujeto.getValor() * valorPlata));
	}
}
