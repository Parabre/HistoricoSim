package view;

import javax.swing.JOptionPane;

import controller.HistoricoController;
import model.PilhaString;

public class Principal {

	public static void main(String[] args) {
		PilhaString pilha = new PilhaString();
		HistoricoController historicoController = new HistoricoController();
		
		boolean exibeMenu = true;
		while (exibeMenu) {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das opções \n "
					+ "1- Inserir novo site \n 2- Remover último endereço" + "\n 3- Consultar último endereço"
							+ "\n 4- Sair"));
			switch (opcao) {
			case 1:
				String site = String.valueOf(JOptionPane.showInputDialog(null, "Digite um site para adicionar"));
				try {
					historicoController.insereValor(pilha, site);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					historicoController.removerUltimoSite(pilha);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					historicoController.consultaUltimoSite(pilha);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 4:
				exibeMenu = false;
				break;
			default:
				System.err.println("Escolha uma opção entre 1 a 4");
				break;
			}
		}
	}
}
