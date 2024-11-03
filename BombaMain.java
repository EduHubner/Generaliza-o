package exBomba;

public class BombaMain {

	public static void main(String[] args) {

		Bomba bomba = new Bomba();
		
		bomba.setTotalLitros(10000);
		bomba.setValorLitro(4.659f);
		
		System.out.println(bomba);
		
		BombaGasolina bGaso = new BombaGasolina();
		
		bGaso.setTotalLitros(5000);
		bGaso.setValorLitro(5.699f);
		
		System.out.println(bGaso);
		
		BombaEtanol bEta = new BombaEtanol();
		
		bEta.setTotalLitros(9000);
		bEta.setValorLitro(3.999f);
		
		System.out.println(bEta);
		
		BombaDiesel bDies = new BombaDiesel();
		
		bDies.setTotalLitros(4000);
		bDies.setValorLitro(6.589f);
		
		System.out.println(bDies);
	}

}
