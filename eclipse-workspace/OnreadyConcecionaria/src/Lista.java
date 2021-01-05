
public class Lista {
	private Nodo ini;
	private int cantNodos;
	
	public Lista() {
		ini=null;
		cantNodos=0;
	}
	
	public void insertar(Vehiculo elemento) {
		Nodo nuevo = new Nodo (elemento, ini);
	    ini = nuevo;
	    cantNodos = getCantNodos() + 1;
	}

	public int getCantNodos() {
		return cantNodos;
	}
	
	public void recorrerLista() {
		Nodo actual = ini;
	    while (actual.getSiguiente()!= null){
	        System.out.println(actual.getDato());
	        actual = actual.getSiguiente();
	    }
	    System.out.println(actual.getDato());
	}

}
