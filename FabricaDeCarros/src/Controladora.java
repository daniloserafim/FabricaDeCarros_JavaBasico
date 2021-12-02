public class Controladora {

	private Carro carro = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:
				
				Fabrica.fabricarCarro(carro);

				break;
			case 1:

				if (Fabrica.carrosProntos.size() != 0) {
					Fabrica.venderCarro(EntradaSaida.venderCarroMsg()-1);
					EntradaSaida.carroVendidoMsg();
				}else {
					EntradaSaida.fabricaVaziaMsg();
				};

				break;
			case 2:
				
				if (Fabrica.carrosProntos.size() != 0) {
					EntradaSaida.exibeCarros();
				}else {				
				EntradaSaida.fabricaVaziaMsg();
				};

				break;
			}
		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
