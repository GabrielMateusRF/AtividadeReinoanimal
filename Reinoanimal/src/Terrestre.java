
public class Terrestre extends Mamifero{
	public double velocidade;
	public int patasanda;
	
	
	public void setVelocidade(double vel) {
		velocidade=vel;
	}

	public double getVelocidade() {
		return velocidade;
	}
	
	public void setAndaEmQuantasPatas(int patas) {
		patasanda=patas;
	}

	public int getAndaEmQuantasPatas() {
		return patasanda;
	}
}
