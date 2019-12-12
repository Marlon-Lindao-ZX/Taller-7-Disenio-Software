package builder;
import auto.*;

public class ChevroletSparktBuilder extends AutoBuilder{

	@Override
	public void DefinirAuto() {
		auto = new Auto();
		auto.setMarca("");
		auto.setModelo("");
		
	}
	
	@Override
	public void InstalarAlmacenamiento() {
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setCapacidad(0);
		almacenamiento.setUnidad("");
		auto.setAlmacenamiento(almacenamiento);
	}

	@Override
	public void ConstruirRuedas() {
		Rueda ruedas = new Rueda();
		ruedas.setDiamentro(0);
		ruedas.setLlanta("");
		ruedas.setNeumatico("");
		auto.setTipoRuedas(ruedas);
		
	}

	@Override
	public void ConstruirCarroceria() {
		Carroceria tipoCarroceria = new Carroceria();
		tipoCarroceria.setTipoCarroceria("");
		auto.setTipoCarroceria(tipoCarroceria);
		
	}

	@Override
	public void ConstruirMotor() {
		Motor tipoMotor = new Motor();
		tipoMotor.setTipoMotor(0);
		auto.setMotor(tipoMotor);
		
	}

	@Override
	public void DefinirExtras() {
		auto.setCierreCentralizado(false);
		auto.setDireccionAsistida(false);
		
	}

}
