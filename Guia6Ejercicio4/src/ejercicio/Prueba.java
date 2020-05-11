package ejercicio;



public class Prueba {

	public static void main(String[] args) {
		ConjuntoNumeros conjunto = new ConjuntoNumeros(7,"Conjunto");
		ConjuntoNumeros clonado = (ConjuntoNumeros)conjunto.clone();
		
		System.out.println(conjunto.toString());
		System.out.println(clonado.toString());
		conjunto.setLargo(8);
		System.out.println(conjunto.toString());
		System.out.println(clonado.toString());
		
		System.out.println("\n\nPunto b:\n\n");
		
		ConjuntoNumeros2 conjunto2 = new ConjuntoNumeros2(7,"Conjunto2");
		ConjuntoNumeros2 clonado2 = (ConjuntoNumeros2)conjunto2.clone();
		System.out.println(conjunto2.toString());
		System.out.println(clonado2.toString());
		conjunto2.setLargo(8);
		System.out.println(conjunto2.toString());
		System.out.println(clonado2.toString());

	}

}
