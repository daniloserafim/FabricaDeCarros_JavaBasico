import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcoes = { "Fabricar carros", "Vender um carro", "Ver informações dos carros",
				"Sair" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor do carro");
	}
	
	public static String solicitaModelo() {
		return JOptionPane.showInputDialog("Informe o modelo do carro");
	}

	public static int solicitaQtdeCarros() {

		int numeroDeCarros = 0;

		do {
			numeroDeCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de carros a serem fabricados"));

			if (numeroDeCarros <= 0) {
				JOptionPane.showMessageDialog(null, "É necessário informar um valor maior que 0!");
			}

		} while (numeroDeCarros <= 0);

		return numeroDeCarros;
	}
	
	public static void fabricaVaziaMsg() {
		JOptionPane.showMessageDialog(null, "A fábrica está vazia, nenhum carro ainda foi fabricado");
	}
	
	public static void exibeCarros() {
		JOptionPane.showMessageDialog(null, Fabrica.listaDeCarros(), "Carros à venda:", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static int venderCarroMsg() {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe o número do carro que deseja vender\n\n"+Fabrica.listaDeCarros()));
	}
	
	public static void carroVendidoMsg() {
		JOptionPane.showMessageDialog(null, "Seu carro foi vendido com sucesso!");
	}
}
