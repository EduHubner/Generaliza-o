package naveEspacial;

public class NaveEspacial {
	
	private double velociadeMaxima;

	public double getVelociadeMaxima() {
		return velociadeMaxima;
	}

	public void setVelociadeMaxima(double velociadeMaxima) {
		this.velociadeMaxima = velociadeMaxima;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NaveEspacial [velociadeMaxima=");
		builder.append(velociadeMaxima);
		builder.append("]");
		return builder.toString();
	}
	
}
