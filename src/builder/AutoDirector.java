package builder;
import auto.*;

public class AutoDirector {
	
	private AutoBuilder builder;

	public AutoDirector(AutoBuilder auto) {
		this.builder = builder;
	}
	
	public void ConstruirAuto() {
		builder.DefinirAuto();
		builder.InstalarAlmacenamiento();
		builder.ConstruirRuedas();
		builder.ConstruirCarroceria();
		builder.ConstruirMotor();
		builder.DefinirExtras();
	}
	
	public Auto getAuto() {
		return builder.getAuto();
	}
	
	
}
