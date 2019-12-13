package ensamblaje.auto.builder;
import ensamblaje.auto.*;

public class ChevroletSparktBuilder extends AutoBuilder{

	@Override
	public void DefinirAuto() {
		auto = new Auto();
		auto.setMarca("Chevrolet");
		auto.setModelo("Sparkt");
		
	}
	
	@Override
	public void InstalarAlmacenamiento() {
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setCapacidad(500);
		almacenamiento.setUnidad("lb");
		auto.setAlmacenamiento(almacenamiento);
	}

	@Override
	public void ConstruirRuedas() {
		Rueda ruedas = new Rueda();
		ruedas.setDiamentro(17);
		ruedas.setLlanta("Aluminio");
		ruedas.setNeumatico("Michelin");
		auto.setTipoRuedas(ruedas);
		
	}

	@Override
	public void ConstruirCarroceria() {
		Carroceria tipoCarroceria = new Carroceria();
		tipoCarroceria.setTipoCarroceria("JWE9EWF8");
		auto.setTipoCarroceria(tipoCarroceria);
		
	}

	@Override
	public void ConstruirMotor() {
		Motor tipoMotor = new Motor();
		tipoMotor.setTipoMotor(1.2f);
		auto.setMotor(tipoMotor);
		
	}

	@Override
	public void DefinirExtras() {
		auto.setCierreCentralizado(false);
		auto.setDireccionAsistida(false);
		
	}

}
