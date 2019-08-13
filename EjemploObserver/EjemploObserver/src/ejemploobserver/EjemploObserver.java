/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploobserver;
import observadores.Cobre;
import observadores.Plata;
import observadores.Sujeto;
/**
 *
 * @author Semuret
 */
public class EjemploObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sujeto subject = new Sujeto();
        new Plata(subject);
        new Cobre(subject);

		
		
		System.out.println("Si desea cambiar 10 barras de oro obtendrá : ");
		subject.setValor(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 barras de oro obtendrá : ");
		subject.setValor(100);
    }
    
}
