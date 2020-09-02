package acceptanceclass;

public class AcceptanceClass {
	private String hola;
	private String mundo;

	public AcceptanceClass() {
		this.setHola("HOLA");
		this.setMundo("ACEPTADORES");
	}

	public String printMessage() {
		return this.getHola() + " " + this.getMundo();
	}

	public String getMundo() {
		return mundo;
	}

	public void setMundo(String mundo) {
		this.mundo = mundo;
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
}


