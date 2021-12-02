import java.util.ArrayList;

public class Fabrica {
	
	static ArrayList<Carro> carrosProntos = new ArrayList<Carro>();
	
	public static void fabricarCarro(Carro carro) {

		int qtdeCarros = EntradaSaida.solicitaQtdeCarros();

		for (int i = 0; i < qtdeCarros; i++) {
			carro  = new Carro();
			carro.setModelo(EntradaSaida.solicitaModelo());
			carro.setCor(EntradaSaida.solicitaCor());
			carrosProntos.add(carro);
		}
	}
	
	public static void venderCarro(int carroVendido) {
		carrosProntos.remove(carroVendido);		
	}
	
	public static String listaDeCarros() {
		
		String listaDeCarros = "";
		
		int totalCarros = carrosProntos.size();
		
		for (int i = 0; i < totalCarros; i++) {
			listaDeCarros += "Carro número "+(i+1)+"\nModelo: "+carrosProntos.get(i).getModelo()+"\nCor: "+carrosProntos.get(i).getCor()+"\n\n";
		}
		
		return listaDeCarros;
	}
}
