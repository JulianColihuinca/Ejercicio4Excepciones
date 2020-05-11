package ejercicio;

import java.util.Arrays;




public class ConjuntoNumeros implements Cloneable {
	

	private int[] celda;
	private int largo;
	private String nombre;
	
	public ConjuntoNumeros(int largo, String nombre) {
		super();
		this.largo = largo;
		this.nombre = nombre;
		if (largo!=0) {
			celda= new int[largo];
			for (int i=0;i<largo;i++) {
				this.celda[i]= i;
			}
		}
		else
			this.celda=null;
	}
	
	public void setLargo(int largo) {
		this.largo=largo;
		celda= new int [largo];
		for (int i=0;i<largo;i++)
			this.celda[i]=i;
	}
	

	public int[] getCelda() {
		return celda;
	}

	public int getLargo() {
		return largo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "ConjuntoNumeros [celda=" + Arrays.toString(celda) + ", largo=" + largo + ", nombre=" + nombre + "]";
	}


	@Override
	public Object clone()  {
		ConjuntoNumeros clonado=null;
		try {	
			clonado= (ConjuntoNumeros)super.clone();
			if (this.celda!=null) {
				clonado.celda= this.celda.clone();
			}
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Nunca se ejecutara");
		}
		return clonado;
	}
	
	

}
