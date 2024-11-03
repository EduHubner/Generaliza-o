package exSimples;

public class ContaMain {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setBanco("Banco do Brasil");
		conta.setAgencia(001);
		conta.setNumeroConta(123456);
		conta.setSaldo(50000.00);
		
		System.out.println(conta);
		
		conta.setSaldo(conta.Deposito(1000, conta.getSaldo()));
		
		System.out.println(conta);
		
		ContaSimples cSimples = new ContaSimples();
		
		cSimples.setAgencia(002);
		cSimples.setBanco("Bradesco");
		cSimples.setNumeroConta(789546);
		cSimples.setSaldo(156000);
		cSimples.setSaldoPoupanca(10000);
		
		cSimples.setSaldoPoupanca(cSimples.Saque(3000, cSimples.getSaldoPoupanca()));
		
		System.out.println(cSimples);
		
		ContaEspecial cEspecial = new ContaEspecial();
		
		cEspecial.setAgencia(3);
		cEspecial.setBanco("Caixa");
		cEspecial.setNumeroConta(13799);
		cEspecial.setSaldo(9000000);
		cEspecial.setDiasSemJuros(20);
		cEspecial.setLimite(100000);
		
		System.out.println(cEspecial);

	}

}
