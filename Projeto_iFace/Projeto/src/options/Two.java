package options;

import java.util.List;
import java.util.Scanner;

import entities.BancoDados;

public class Two implements Options{
	public String escolhasLogado(boolean verificacao, int entradaConfigurarPerfil, String loginConta, BancoDados dados, Scanner sc, List<String> auxiliar) {
		dados.imprimirConta(loginConta);
		return loginConta;
	}
}
