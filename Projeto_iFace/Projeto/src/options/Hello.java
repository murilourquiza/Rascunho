package options;

import java.util.List;
import java.util.Scanner;

import entities.BancoDados;

public class Hello {
	public void Write(Options language, boolean verificacao, int entradaConfigurarPerfil, String loginConta, BancoDados dados, Scanner sc, List<String> auxiliar)
    {
        language.escolhasLogado(verificacao, entradaConfigurarPerfil, loginConta, dados, sc, auxiliar);
    }
}
