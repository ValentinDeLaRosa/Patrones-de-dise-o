package observadores;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Semuret
 */
public class Sujeto {
    private List<Observador> observadores = new ArrayList<Observador>();
	private int valor;
        public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
		avisarObservadores();
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}

	public void avisarObservadores() {
		observadores.forEach(x -> x.actualizar());
	}
}
