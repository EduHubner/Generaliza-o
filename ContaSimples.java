package exSimples;

public class ContaSimples extends Conta {
	
	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public double Deposito(double valor, double saldo) {
		if (valor > 0) {
			return (saldo + valor);
		}
		return saldo;
	}
	
	public double Saque(double valor, double saldo) {
		if (valor > 0) {
			return (saldo - valor);
		}
		return saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
