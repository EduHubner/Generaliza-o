package exAnimal;

public class Cao extends Mamifero {
	
	private boolean latido;

	public boolean isLatido() {
		return latido;
	}

	public void setLatido(boolean latido) {
		this.latido = latido;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [latido=");
		builder.append(latido);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
