package exAnimal;

public class Mamifero extends Animal {
	
	private int quantGlandMamarias;

	public int getQuantGlandMamarias() {
		return quantGlandMamarias;
	}

	public void setQuantGlandMamarias(int quantGlandMamarias) {
		this.quantGlandMamarias = quantGlandMamarias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [quantGlandMamarias=");
		builder.append(quantGlandMamarias);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
