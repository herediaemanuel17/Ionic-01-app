import java.util.ArrayList;

Collections.sort(personas, new Comparator() {
	@Override
	public int compare(Persona p1, Persona p2) {
		// Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
		return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
	}
});

public class Concecionaria {
	
	public static void listarVehiculos(ArrayList<Vehiculo> l) {
		for(Vehiculo v : l) {
			if(v.getClass().getName().equals("Auto")) {
				System.out.println("Marca: "+v.getMarca()+" // Modelo: "+v.getModelo()+ " // Puertas: "+ ((Auto) v).getCantPuertas()+" // Precio: $"+v.getPrecio());
				
			}else{
				System.out.println("Marca: "+v.getMarca()+" // Modelo: "+v.getModelo()+ " // Puertas: "+ ((Moto) v).getCilindradas()+"cc // Precio: $"+v.getPrecio());
			};
		}
	}
	
	public static void vehiculoMasCaro(ArrayList<Vehiculo> l) {
		float max=-1;
		String vehiculoCaro =" ";
		for(Vehiculo v: l) {
			if(v.getPrecio()>max) {
				max=v.getPrecio();
				vehiculoCaro=v.getMarca()+" "+v.getModelo();
			}
		}
		System.out.println("Vehiculo mas caro: "+ vehiculoCaro);
	}
	
	public static void vehiculoMasBarato(ArrayList<Vehiculo> l) {
		float min=999999;
		String vehiculoBarato =" ";
		for(Vehiculo v: l) {
			if(v.getPrecio()<min) {
				min=v.getPrecio();
				vehiculoBarato=v.getMarca()+" "+v.getModelo();
			}
		}
		System.out.println("Vehiculo mas Barato: "+ vehiculoBarato);
	}
	
	public static void vehiculoConLetra(ArrayList<Vehiculo> l) {
		
		for(Vehiculo v: l) {
			if(v.getModelo().indexOf("Y")!=-1) {
				System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+v.getMarca()+" "+v.getModelo()+" $"+v.getPrecio());
			}
			break;
		}
		
	}
	public static void main(String[] args) {
		//Lista lis=new Lista();
		ArrayList<Vehiculo> lis = new ArrayList<Vehiculo>();
		
		lis.add(new Auto("Peugeot","206",(float)200000,4));
		lis.add(new Moto("Honda","Titan",(float)60000,125));
		lis.add(new Auto("Peugeot","208",(float)250000,5));
		lis.add(new Moto("Yamaha","YBR",(float) 80500.5,160));
		/*
		
		lis.insertar(nuevoAuto);
		Vehiculo nuevaMoto=;
		lis.insertar(nuevaMoto);
		Vehiculo nuevoAuto2=;
		lis.insertar(nuevoAuto2);
		Vehiculo nuevaMoto2=;
		lis.insertar(nuevaMoto2);
		*/
		//System.out.println()
		
		listarVehiculos(lis);
		
		
		
		
	}

	

}
