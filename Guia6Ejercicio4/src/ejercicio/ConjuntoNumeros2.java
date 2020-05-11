package ejercicio;

import java.util.Arrays;


public class ConjuntoNumeros2 implements Cloneable {
	private Numero[] celda;
	private int largo;
	private String nombre;
	
	
	public ConjuntoNumeros2(int largo, String nombre) {
		super();
		this.largo = largo;
		this.nombre = nombre;
		if (largo>0) {
			this.celda= new Numero[largo];
			for (int i=0;i<largo;i++)
				this.celda[i]= new Numero(i);
		}
		else
			this.celda=null;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
		this.celda= new Numero[largo];
		for (int i=0;i<largo;i++) 
			this.celda[i]= new Numero(i);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Numero[] getCelda() {
		return celda;
	}


	@Override
	public Object clone()  {
		ConjuntoNumeros2 clonado=null;
		try {
			clonado= (ConjuntoNumeros2)super.clone();
			Numero[] celdaClonada=null;
			if (this.celda!=null) {
				celdaClonada= new Numero[largo];
				for (int i=0; i<this.largo;i++)
					celdaClonada[i]=(Numero) this.celda[i].clone();
			}
			clonado.celda= celdaClonada;
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Nunca se ejecutara PUTTOOO");
		}
		return clonado;
	}


	@Override
	public String toString() {
		return "ConjuntoNumeros2 [celda=" + Arrays.toString(celda) + ", largo=" + largo + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
