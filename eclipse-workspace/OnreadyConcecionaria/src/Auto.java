
public class Auto extends Vehiculo {
	private int cantPuertas;

	public Auto(String nuevaMarca, String nuevoModelo, float nuevoPrecio, int cantP) {
		super(nuevaMarca, nuevoModelo, nuevoPrecio);
		this.setCantPuertas(cantP);
		// TODO Auto-generated constructor stub
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

	

}
