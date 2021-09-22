
public class Animalbase {
	public String nome;
	public String ingere;  /*Se e carnivoro, herbivoro ou onivoro*/
	public double tempomedio;
	public double tamanhomedio;


public void setNome(String nomein) {
	nome=nomein;
	}

public String getNome() {
	return nome;
	}

public void setIngere(String ingerein) {
	ingere=ingerein;
	}

public String getIngeree() {
	return ingere;
	}

public void setTempoMedio(double idade) {
	tempomedio=idade;
	}

public double getTempoMedio() {
	return tempomedio;
	}

public void setTamanhoMedio(double d) {
	tamanhomedio=d;
	}

public double getTamanhoMedio() {
	return tamanhomedio;
	}


}