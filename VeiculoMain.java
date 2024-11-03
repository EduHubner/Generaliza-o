package uml;

public class VeiculoMain {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		
		v.setMotor(true);
		
		System.out.println(v);
		
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.setMotor(true);
		caminhao.setEixos(4);
		
		System.out.println(caminhao);
		
		
		Carro carro = new Carro();
		
		carro.setMotor(false);
		carro.setPortas(2);
		
		System.out.println(carro);
		
		
		Moto moto = new Moto();
		
		moto.setMotor(true);
		moto.setCilindrada(100);
		
		System.out.println(moto);
	}

}
