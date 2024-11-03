package exAnimal;

public class Tartaruga extends Reptil {
	
	private double tamanhoCasca;

	public double getTamanhoCasca() {
		return tamanhoCasca;
	}

	public void setTamanhoCasca(double tamanhoCasca) {
		this.tamanhoCasca = tamanhoCasca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tartaruga [tamanhoCasca=");
		builder.append(tamanhoCasca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
