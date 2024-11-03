package exAmbinte;

public class AmbienteMain {

	public static void main(String[] args) {
		
		Ambiente casa = new Ambiente();
		
		casa.setArea(36.504f);
		
		System.out.println(casa);

		Quarto quarto = new Quarto();
		
		quarto.setArea(5);
		quarto.setCapacidade(2);
		
		System.out.println(quarto);

		Sala sala = new Sala();
		
		sala.setArea(10);
		sala.setTv(true);
		
		System.out.println(sala);
		
		Banheiro banheiro = new Banheiro();
		
		banheiro.setArea(8);
		banheiro.setBanheira(false);
		
		System.out.println(banheiro);
		
		Cozinha cozinha = new Cozinha();
		
		cozinha.setArea(10);
		cozinha.setMicroondas(true);
		
		System.out.println(cozinha);

	}

}
