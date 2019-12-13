package ensamblaje.auto.builder;
import ensamblaje.auto.*;

public class HyundaiSantaFeBuilder extends AutoBuilder{
	
	@Override
	public void DefinirAuto() {
		auto = new Auto();
		auto.setMarca("Hyundai");
		auto.setModelo("Santa Fe");
		
	}
	
	@Override
	public void InstalarAlmacenamiento() {
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setCapacidad(650);
		almacenamiento.setUnidad("L");
		auto.setAlmacenamiento(almacenamiento);
	}

	@Override
	public void ConstruirRuedas() {
		Rueda ruedas = new Rueda();
		ruedas.setDiamentro(16);
		ruedas.setLlanta("Aleacion 17");
		ruedas.setNeumatico("Firestone");
		auto.setTipoRuedas(ruedas);
		
	}

	@Override
	public void ConstruirCarroceria() {
		Carroceria tipoCarroceria = new Carroceria();
		tipoCarroceria.setTipoCarroceria("9BE5FVK8");
		auto.setTipoCarroceria(tipoCarroceria);
		
	}

	@Override
	public void ConstruirMotor() {
		Motor tipoMotor = new Motor();
		tipoMotor.setTipoMotor(2.2f);
		auto.setMotor(tipoMotor);
		
	}

	@Override
	public void DefinirExtras() {
		auto.setCierreCentralizado(false);
		auto.setDireccionAsistida(false);
		
	}
}
