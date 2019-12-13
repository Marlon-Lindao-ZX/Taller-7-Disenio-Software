package ensamblaje.auto.builder;
import ensamblaje.auto.*;

public class ChevroletSailBuilder extends AutoBuilder {

	@Override
	public void DefinirAuto() {
		auto = new Auto();
		auto.setMarca("Chevrolet");
		auto.setModelo("Sail");
		
	}
	
	@Override
	public void InstalarAlmacenamiento() {
		Almacenamiento almacenamiento = new Almacenamiento();
		almacenamiento.setCapacidad(1000);
		almacenamiento.setUnidad("lb");
		auto.setAlmacenamiento(almacenamiento);
	}

	@Override
	public void ConstruirRuedas() {
		Rueda ruedas = new Rueda();
		ruedas.setDiamentro(15);
		ruedas.setLlanta("Hierro");
		ruedas.setNeumatico("Firestone");
		auto.setTipoRuedas(ruedas);
		
	}

	@Override
	public void ConstruirCarroceria() {
		Carroceria tipoCarroceria = new Carroceria();
		tipoCarroceria.setTipoCarroceria("1J23KO23");
		auto.setTipoCarroceria(tipoCarroceria);
		
	}

	@Override
	public void ConstruirMotor() {
		Motor tipoMotor = new Motor();
		tipoMotor.setTipoMotor(1.4f);
		auto.setMotor(tipoMotor);
		
	}

	@Override
	public void DefinirExtras() {
		auto.setCierreCentralizado(false);
		auto.setDireccionAsistida(false);
		
	}

}
