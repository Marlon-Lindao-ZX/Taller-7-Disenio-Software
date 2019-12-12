package auto;

public class Rueda {
	private int diamentro;
	private String llanta;
	private String neumatico;
	
	public Rueda() {}
	
	public Rueda(int diamentro, String llanta, String neumatico) {
		super();
		this.diamentro = diamentro;
		this.llanta = llanta;
		this.neumatico = neumatico;
	}

	public int getDiamentro() {
		return diamentro;
	}

	public void setDiamentro(int diamentro) {
		this.diamentro = diamentro;
	}

	public String getLlanta() {
		return llanta;
	}

	public void setLlanta(String llanta) {
		this.llanta = llanta;
	}

	public String getNeumatico() {
		return neumatico;
	}

	public void setNeumatico(String neumatico) {
		this.neumatico = neumatico;
	}
	
	
	
	
}
