package controller;

import java.net.URL;

import model.PilhaString;

public class HistoricoController {

	public void insereValor(PilhaString p, String op) throws Exception {
		try {
			URL u = new URL(op);
			u.toURI();
			p.push(op);
			if(!op.contains("www.") || !op.contains(".co")) {
				throw new Exception("Digite um site válido");
			}
		} catch (Exception e) {
			throw new Exception("Digite um site válido");
		}
		System.out.println("Site adicionado! " + p.top());
	}

	public void consultaUltimoSite(PilhaString p) throws Exception {
		System.out.println("Último site encontrado: " + p.top());
	}

	public void removerUltimoSite(PilhaString p) throws Exception {
		System.out.println("Site removido: " + p.pop());
	}
}
