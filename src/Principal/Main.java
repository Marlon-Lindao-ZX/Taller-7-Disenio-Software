package principal;
import ensamblaje.auto.*;
import ensamblaje.auto.builder.*;

public class Main {
	public static void main(String[] args) {
		
		//Ensamblaje del auto Chevrolet Sail
		AutoDirector directorSail = new AutoDirector(new ChevroletSailBuilder());
		directorSail.ConstruirAuto();
		Auto sail1= directorSail.getAuto();
		
		//Ensamblaje del auto Chevrolet Sparkt
		AutoDirector directorSparkt = new AutoDirector(new ChevroletSparktBuilder());
		directorSparkt.ConstruirAuto();
		Auto spark1 = directorSparkt.getAuto();
		
		//Ensamblaje del auto Hyundai Santa Fe
		AutoDirector directorSantaFe = new AutoDirector(new HyundaiSantaFeBuilder());
		directorSantaFe.ConstruirAuto();
		Auto santaFe1 = directorSantaFe.getAuto();
		
		//Mostrar las caracteristicas de los autos 
		System.out.println(sail1.toString());
		System.out.println(spark1.toString());
		System.out.println(santaFe1.toString());

	}
}
