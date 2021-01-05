
public class Vehiculo {
	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo(String nuevaMarca, String nuevoModelo, float nuevoPrecio){
		this.marca=nuevaMarca;
		this.modelo=nuevoModelo;
		this.precio=nuevoPrecio;
		
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	Collections.sort(vehiculo, new Comparator() {
		@Override
		public int compare(Persona p1, Persona p2) {
			// Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
			return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
		}
	});
}
