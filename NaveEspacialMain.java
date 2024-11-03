package naveEspacial;

public class NaveEspacialMain {

	public static void main(String[] args) {
		
		NaveEspacial naveEspacial = new NaveEspacial();
		
		naveEspacial.setVelociadeMaxima(900);
		
		System.out.println(naveEspacial);
		
		Apolo11 apolo = new Apolo11();
		
		apolo.setVelociadeMaxima(800);
		apolo.setTipoCombustivel("Gasolina");
		
		System.out.println(apolo);
		
		MillenniumFalcon miFa = new MillenniumFalcon();
		
		miFa.setVelociadeMaxima(1000);
		miFa.setTipoCombustivel("Etanol");
		miFa.setHiperPropulsor(15);
		
		System.out.println(miFa);

	}

}
