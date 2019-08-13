package ejemplo2observer;


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
	private String estado;
        public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
		avisarObservadores();
	}

	public void agregar(Observador observador) {
		observadores.add(observador);
	}

	public void avisarObservadores() {
		observadores.forEach(x -> x.actualizar());
	}
}
