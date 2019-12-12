package builder;
import auto.*;

public abstract class AutoBuilder {
	protected Auto auto;
	
	public Auto getAuto() {
		return auto;
	}
	
	public abstract void DefinirAuto();
	public abstract void InstalarAlmacenamiento();
	public abstract void ConstruirRuedas();
	public abstract void ConstruirCarroceria();
	public abstract void ConstruirMotor();
	public abstract void DefinirExtras();
	
	
}
