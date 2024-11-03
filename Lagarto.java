package exAnimal;

public class Lagarto extends Reptil {
	
	private int tamanhoCauda;

	public int getTamanhoCauda() {
		return tamanhoCauda;
	}

	public void setTamanhoCauda(int tamanhoCauda) {
		this.tamanhoCauda = tamanhoCauda;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [tamanhoCauda=");
		builder.append(tamanhoCauda);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
