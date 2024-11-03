package exAnimal;

public class Gato extends Mamifero {
	
	private boolean visaoNoturna;

	public boolean isVisaoNoturna() {
		return visaoNoturna;
	}

	public void setVisaoNoturna(boolean visaoNoturna) {
		this.visaoNoturna = visaoNoturna;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [visaoNoturna=");
		builder.append(visaoNoturna);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
