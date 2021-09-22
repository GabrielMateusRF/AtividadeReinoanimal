
public class Main {

	public static void main(String[] args) {
		///Cavalo
		Terrestre Cavalo = new Terrestre();
		Cavalo.setNome("Cavalo");
		Cavalo.setIngere("Herbívoro");
		Cavalo.setTamanhoMedio(1.4);
		Cavalo.setTempoMedio(25);
		Cavalo.setTamanhoColuna(1);
		Cavalo.setPelos(true);
		Cavalo.setMembros(4);
		Cavalo.setNumfilhos(2);
		Cavalo.setVelocidade(88);
		Cavalo.setAndaEmQuantasPatas(4);
		
		Aereo Morcego = new Aereo();
		Morcego.setNome("Morcego");
		Morcego.setIngere("Onívoro");
		Morcego.setTamanhoMedio(0.7);
		Morcego.setTempoMedio(30);
		Morcego.setTamanhoColuna(0.4); ///Na realidade esse dado não achei
		Morcego.setPelos(true);
		Morcego.setMembros(4);
		Morcego.setNumfilhos(4);
		Morcego.setTamanhoAsas(0.8);
		
		Aquatico Golfinho = new Aquatico();
		Golfinho.setNome("Golfinho");
		Golfinho.setIngere("Carnívoro");
		Golfinho.setTamanhoMedio(3);
		Golfinho.setTempoMedio(40);
		Golfinho.setTamanhoColuna(2.5);
		Golfinho.setPelos(false);
		Golfinho.setMembros(2);
		Golfinho.setNumfilhos(1);
		Golfinho.setBarbatanas(2);
		Golfinho.setProfundidade(0.3);
		
		
		System.out.println("-------------------------");
		System.out.println("	Lista de animais     ");
		System.out.println("-------------------------");
		System.out.printf("Nome...................:%s\n", Cavalo.getNome());
		System.out.printf("Come...................:%s\n", Cavalo.getIngeree());
		System.out.printf("Tamanho médio......... :%.2f metros\n", Cavalo.getTamanhoMedio());
		System.out.printf("Tempo de vida médio....:%.2f anos\n", Cavalo.getTempoMedio());
		System.out.printf("Tamanho coluna.........:%.2f metros\n", Cavalo.getTamanhoColuna());
		System.out.printf("Tem pelos..............:%b\n", Cavalo.getPelos());
		System.out.printf("Quantidade de membros..:%d membros\n", Cavalo.getMembros());
		System.out.printf("Media de filhos anual..:%d filhos\n", Cavalo.getNumfilhos());
		System.out.printf("Velocidade.............:%.2fKM/h\n", Cavalo.getVelocidade());
		System.out.printf("Anda em patas..........:%d patas\n", Cavalo.getAndaEmQuantasPatas());
		System.out.printf("\n\n");
		System.out.printf("Nome...................:%s\n", Morcego.getNome());
		System.out.printf("Come...................:%s\n", Morcego.getIngeree());
		System.out.printf("Tamanho médio......... :%.2f metros\n", Morcego.getTamanhoMedio());
		System.out.printf("Tempo de vida médio....:%.2f anos\n", Morcego.getTempoMedio());
		System.out.printf("Tamanho coluna.........:%.2f metros\n", Morcego.getTamanhoColuna());
		System.out.printf("Tem pelos..............:%b\n", Morcego.getPelos());
		System.out.printf("Quantidade de membros..:%d membros\n", Morcego.getMembros());
		System.out.printf("Media de filhos anual..:%d filhos\n", Morcego.getNumfilhos());
		System.out.printf("Tamanho asas...........:%.2f metros\n", Morcego.getTamanhoAsas());
		System.out.printf("\n\n");
		System.out.printf("Nome...................:%s\n", Golfinho.getNome());
		System.out.printf("Come...................:%s\n", Golfinho.getIngeree());
		System.out.printf("Tamanho médio......... :%.2f metros\n", Golfinho.getTamanhoMedio());
		System.out.printf("Tempo de vida médio....:%.2f anos\n", Golfinho.getTempoMedio());
		System.out.printf("Tamanho coluna.........:%.2f metros\n", Golfinho.getTamanhoColuna());
		System.out.printf("Tem pelos..............:%b\n", Golfinho.getPelos());
		System.out.printf("Quantidade de membros..:%d membros\n", Golfinho.getMembros());
		System.out.printf("Media de filhos anual..:%d filhos\n", Golfinho.getNumfilhos());
		System.out.printf("Numero de barbatanas...:%d barbatanas\n", Golfinho.getBarbatanas());
		System.out.printf("Profundidade Máxima....:%.2f km\n", Golfinho.getProfundidade());
		System.out.printf("\n\n");
		
	}

}
