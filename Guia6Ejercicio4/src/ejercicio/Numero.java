package ejercicio;


public class Numero implements Cloneable {
	private int dato;

	public Numero(int dato) {
		this.dato = dato;
	}

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return this.dato+" ";
	}

	@Override
	public Object clone()  {
		Numero clonado= null;
		try {
			clonado= (Numero)super.clone();
		}
		catch(CloneNotSupportedException e) {
			
		}
		
		return clonado;
	}
	
	
}
