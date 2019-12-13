package ensamblaje.auto;

public class Auto {
	private String marca;
	private String modelo;
	private Motor motor;
	private Almacenamiento almacenamiento;
	private Carroceria tipoCarroceria;
	private Rueda tipoRuedas;
	private boolean cierreCentralizado;
	private boolean direccionAsistida;
	
	
	public Auto() {}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public Carroceria getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(Carroceria tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}

	public Rueda getTipoRuedas() {
		return tipoRuedas;
	}

	public void setTipoRuedas(Rueda tipoRuedas) {
		this.tipoRuedas = tipoRuedas;
	}

	public boolean isCierreCentralizado() {
		return cierreCentralizado;
	}

	public void setCierreCentralizado(boolean cierreCentralizado) {
		this.cierreCentralizado = cierreCentralizado;
	}

	public boolean isDireccionAsistida() {
		return direccionAsistida;
	}

	public void setDireccionAsistida(boolean direccionAsistida) {
		this.direccionAsistida = direccionAsistida;
	}

	@Override
	public String toString() {
		StringBuilder detalle = new StringBuilder("Especificiaciones Tecnicas:\n");
        detalle.append("Marca: "+marca +"\n");
        detalle.append("Modelo: "+modelo +"\n");
        detalle.append("Motor: "+motor.getTipoMotor()+" \n");
        detalle.append("Almacenamiento: "+almacenamiento.getCapacidad() +" "+almacenamiento.getUnidad() +"\n");
        detalle.append("Carroceria: "+tipoCarroceria.getTipoCarroceria()+"\n");
		return detalle.toString();
	}
	
	
	
	
	
	
	
	
}
