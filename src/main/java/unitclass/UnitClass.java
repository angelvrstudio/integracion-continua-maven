package unitclass;

public class UnitClass {

	private String hola;
	private String mundo;
	
	public UnitClass(){
		this.setHola("HOLA");
		this.setMundo("UNITARIOS");
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
