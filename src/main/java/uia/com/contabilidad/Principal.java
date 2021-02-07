package uia.com.contabilidad;

import uia.com.contabilidad.gestor.DecoradorCobranza;
import uia.com.contabilidad.gestor.DecoradorCompras;
import uia.com.contabilidad.gestor.Gestor;

public class Principal {

	public static void main(String[] args) {
		
		
		System.out.println("Hola UIA");
		
		Gestor contabilidad = new Gestor("C:\\Users\\leolu\\eclipse-workspace\\contabilidadUIA\\cuentasXCobrar.json");
		
		 DecoradorCobranza gestorCobranza = new DecoradorCobranza(contabilidad);
		 
		 gestorCobranza.Print();
		 gestorCobranza.validaCobranza();
		 
				 
		
		 DecoradorCompras gestorCompras = new DecoradorCompras(contabilidad);
		 gestorCompras.registraCheque();
		 
		//miGestorClientes.registraCheque("Alfonso", "Cheques", "ClienteX");
		
		
	}


}
