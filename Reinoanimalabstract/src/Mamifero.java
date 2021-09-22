///Nota: testando o uso de protected em procedimentos
public abstract class Mamifero  extends Cordados{
	public boolean pelos;
	public int numeromembros;
	public int filhosmedio;
	
	protected void setPelos(boolean confirm) {
		pelos=confirm;
	}

	protected boolean getPelos() {
		return pelos;
	}
	
	protected void setMembros(int numero) {
		numeromembros=numero;
	}

	protected int getMembros() {
		return numeromembros;
	}
	
	protected void setNumfilhos(int numfilho) {
		filhosmedio=numfilho;
	}

	protected int getNumfilhos() {
		return filhosmedio;
	}
	
	
}
