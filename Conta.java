package exSimples;

public class Conta {

		private String banco;
		private int agencia;
		private int numeroConta;
		private double saldo;
		
		public String getBanco() {
			return banco;
		}
		public void setBanco(String banco) {
			this.banco = banco;
		}
		public int getAgencia() {
			return agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public int getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
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
			builder.append("Conta [banco=");
			builder.append(banco);
			builder.append(", agencia=");
			builder.append(agencia);
			builder.append(", numeroConta=");
			builder.append(numeroConta);
			builder.append(", saldo=");
			builder.append(saldo);
			builder.append("]");
			return builder.toString();
		}
		
		
		
}
