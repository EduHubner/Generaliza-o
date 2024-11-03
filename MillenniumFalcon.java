package naveEspacial;

public class MillenniumFalcon extends Apolo11 {
	
	private float hiperPropulsor;

	public float getHiperPropulsor() {
		return hiperPropulsor;
	}

	public void setHiperPropulsor(float hiperPropulsor) {
		this.hiperPropulsor = hiperPropulsor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MillenniumFalcon [hiperPropulsor=");
		builder.append(hiperPropulsor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
