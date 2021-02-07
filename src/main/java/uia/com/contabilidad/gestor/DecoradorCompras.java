package uia.com.contabilidad.gestor;


import uia.com.contabilidad.clientes.Cliente;

public class DecoradorCompras extends Decorador {

	public DecoradorCompras (IGestor gestor)
	{
		super (gestor);
	}
	
	public DecoradorCompras() {
		
	}

	
	public void registraCheque() 
	{
		
		super.Print();
	}
	
	
}
