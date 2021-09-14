
public class Mamifero  extends Cordados{
	public boolean pelos;
	public int numeromembros;
	public int filhosmedio;
	
	public void setPelos(boolean confirm) {
		pelos=confirm;
	}

	public boolean getPelos() {
		return pelos;
	}
	
	public void setMembros(int numero) {
		numeromembros=numero;
	}

	public int getMembros() {
		return numeromembros;
	}
	
	public void setNumfilhos(int numfilho) {
		filhosmedio=numfilho;
	}

	public int getNumfilhos() {
		return filhosmedio;
	}
	
	
}
