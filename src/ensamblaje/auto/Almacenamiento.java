package ensamblaje.auto;

public class Almacenamiento {
	private int capacidad;
	private String unidad;
	
	public Almacenamiento() {}
	
	public Almacenamiento(int capacidad, String unidad) {
		this.capacidad = capacidad;
		this.unidad = unidad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
	
	
}
