package exAnimal;

public class Reptil extends Animal {
	
	private int quantOvos;

	public int getQuantOvos() {
		return quantOvos;
	}

	public void setQuantOvos(int quantOvos) {
		this.quantOvos = quantOvos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [quantOvos=");
		builder.append(quantOvos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
