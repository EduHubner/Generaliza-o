package uml;

public class Carro extends Veiculo{
	
	private int portas;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		if (portas >= 2)
			this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
