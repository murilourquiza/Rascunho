package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.BancoDados;
import options.Eight;
import options.Eleven;
import options.Fifteen;
import options.Five;
import options.Four;
import options.Fourteen;
import options.Hello;
import options.Nine;
import options.Nineteen;
import options.Options;
import options.One;
import options.Seven;
import options.Seventeen;
import options.Six;
import options.Sixteen;
import options.Ten;
import options.Three;
import options.Threteen;
import options.Twelve;
import options.Two;

public class Main {
	
	public static void paginaInicial() {
		System.out.println("Bem-vindo ao iFace!");
		System.out.println("");
		System.out.println("1-> Cadastrar-se");
		System.out.println("2-> Fazer Login");
		System.out.println("3-> Sair do iFace");
	} 
	
	public static void cadastro(Scanner sc, BancoDados dados) {
		System.out.println("Informe seu login:");
		String login = sc.nextLine();
		if(dados.buscaList(login) != null) {
		    System.out.println("Login ja existente.");
		} else {
			System.out.println("Informe sua senha:");
			String senha = sc.nextLine();
			System.out.println("Informe seu nome:");
			String nome = sc.nextLine();
			dados.addList(login, senha, nome);
			System.out.println("Login criado com sucesso.");
		}
	}
	
	public static void paginaLogin(String loginConta, BancoDados dados) {
		System.out.println("\n---------------------------------------");
		System.out.println("L o g i n : " + loginConta);
		System.out.println("---------------------------------------");
	    System.out.println("Solicitacoes (" + dados.mostrarSolUsu(loginConta) +")");
		System.out.println("Amigos (" + dados.mostrarAmi(loginConta) +")");
		System.out.println("Mensagens (" + dados.mostrarMen(loginConta) +")");
		System.out.println("Comunidades (" + dados.mostrarCom(loginConta) +")");
		System.out.println("");
		System.out.println("PERFIL");
		System.out.println("  01-> Configurar Perfil");
		System.out.println("  02-> Visualizar Perfil");
		System.out.println("AMIGOS");
		System.out.println("  03-> Solicitar Nova Amizade");
		System.out.println("  04-> Verificar Pedidos de Amizade");
		System.out.println("  05-> Ver Amigos");
		System.out.println("MENSAGENS");
		System.out.println("  06-> Enviar Mensagem para um Usuario");
		System.out.println("  07-> Enviar Mensagem para uma Comunidade");
		System.out.println("  08-> Visualizar Todas as Mensagens");
		System.out.println("COMUNIDADES");
		System.out.println("  09-> Criar comunidade");
		System.out.println("  10-> Entrar em uma comunidade");
		System.out.println("  11-> Visualizar Comunidades Existentes");
		System.out.println("  12-> Ver Minhas Comunidades");
		System.out.println("  13-> Sair de uma Comunidade");
		System.out.println("FEED");
		System.out.println("  14-> Configurar seu Feed de Noticias");
		System.out.println("  15-> Escrever no Feed de Noticias");
		System.out.println("  16-> Visualizar Meu Feed");
		System.out.println("  17-> Visualizar Feed Geral");
		System.out.println("...");
		System.out.println("  19-> Cancelar Cadastro");
		System.out.println("  20-> Deslogar");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> auxiliar = new ArrayList<>();
		
		int entrada1=0;
		int entradaLogin=0;
		int entradaConfigurarPerfil=0;
		
		BancoDados dados = new BancoDados();
		
		do {
			boolean verificacao = false;
			while(verificacao == false)	{		    
				try {
					paginaInicial();
					System.out.print("Digite sua opcao: ");
					entrada1 = Integer.parseInt(sc.nextLine());
					verificacao = true;
					System.out.println("");
				} 
				catch (NumberFormatException e) {
					System.out.println("\n" + "Erro na entrada: " + e + "\n");
				}
			}
			
			switch (entrada1) {
			case 1:
				cadastro(sc, dados);
		     break;
			case 2:
				if(dados.getTamanhoLista() == 0) {
			    	System.out.println("Sem usuarios cadastrados");
			    } else {
			    	System.out.println("Informe seu login:");
			    	String loginConta = sc.nextLine();
			    	String nome_LoginConta = dados.buscaList(loginConta);
			    	if(nome_LoginConta == null) {
			    		System.out.println("Login nao cadastrado");
			    	} else {
					    do {
					    	verificacao = false;
							while(verificacao == false){
								try {
						    		paginaLogin(loginConta, dados);
						    		System.out.print("Digite sua opcao: ");
									entradaLogin = Integer.parseInt(sc.nextLine());
									verificacao = true;
									System.out.println("");
								} 
								catch (NumberFormatException e) {
									System.out.println("\n" + "Erro na entrada: " + e + "\n");
								}
							}
							
							Options teste = new Two();
					    	
						    switch (entradaLogin) {
							case 1:
								teste = new One();
							 break;
						    case 2:
						    	teste = new Two();
						     break;
						    case 3:
						    	teste = new Three();
						     break;
						    case 4:
						    	teste = new Four();
						     break;
						    case 5:
						    	teste = new Five();
						     break;
						    case 6:
						    	teste = new Six();
						     break;
						    case 7:
						    	teste = new Seven();
						     break;
						    case 8:
						    	teste = new Eight();
						     break;
						    case 9:
						    	teste = new Nine();
						     break;
						    case 10:
						    	teste = new Ten();
						     break;
						    case 11:
						    	teste = new Eleven();
						     break;
						    case 12:
						    	teste = new Twelve();
						     break;
						    case 13:
						    	teste = new Threteen();
						     break;
							case 14:
								teste = new Fourteen();
						     break;
						    case 15:
						    	teste = new Fifteen();
						     break;
						    case 16:
						    	teste = new Sixteen();
						     break;
						    case 17:
						    	teste = new Seventeen();
						     break;
						    case 19:
						    	teste = new Nineteen();
						    	entradaLogin = 20;
						     break;
						    case 20:
						     break;
							default:
								System.out.println("Opcao Invalida.");
					        }
						    
						    new Hello().Write(teste, verificacao, entradaConfigurarPerfil, loginConta, dados, sc, auxiliar);
					    } while (entradaLogin != 20);
			    	}
		        }
			 break;
			default:
				System.out.println("Digite um numero correto");
			}
		} while(entrada1 != 3);
		
		System.out.println("\nObrigado por confiar no iFace.");
	    sc.close();
	}
}

/*switch (entradaLogin) {
case 1:
	One menu = new One();
	loginConta = menu.escolhasLogado(verificacao, entradaConfigurarPerfil, loginConta, dados, sc, auxiliar);
 break;
case 2:
	Two menu2 = new Two();
	loginConta = menu2.escolhasLogado(verificacao, entradaConfigurarPerfil, loginConta, dados, sc, auxiliar);
 break;
case 3:
	Three menu3 = new Three();
	loginConta = menu3.menuTres(dados, sc, loginConta);
 break;
case 4:
	Four menu4 = new Four();
	loginConta = menu4.menuQuatro(dados, sc, loginConta, auxiliar, verificacao);
 break;
case 5:
	Five menu5 = new Five();
	loginConta = menu5.menuCinco(dados, loginConta, auxiliar);
 break;
case 6:
	Six menu6 = new Six();
	loginConta = menu6.menuSeis(dados, sc, loginConta);
 break;
case 7:
	Seven menu7 = new Seven();
	loginConta = menu7.menuSete(dados, sc, loginConta);
 break;
case 8:
	Eight menu8 = new Eight();
	loginConta = menu8.menuOito(dados, loginConta, auxiliar);
 break;
case 9:
	Nine menu9 = new Nine();
	loginConta = menu9.menuNove(dados, sc, loginConta);
 break;
case 10:
	Ten menu10 = new Ten();
	loginConta = menu10.menuDez(dados, sc, loginConta);
 break;
case 11:
	Eleven menu11 = new Eleven();
	loginConta = menu11.menuOnze(dados, loginConta);
 break;
case 12:
	Twelve menu12 = new Twelve();
	loginConta = menu12.menuDoze(dados, loginConta, auxiliar);
 break;
case 13:
	Threteen menu13 = new Threteen();
	loginConta = menu13.menuTreze(dados, loginConta, auxiliar, sc);
 break;
case 14:
	Fourteen menu14 = new Fourteen();
	loginConta = menu14.menuQuartoze(dados, loginConta, sc, verificacao);
 break;
case 15:
	Fifteen menu15 = new Fifteen();
	loginConta = menu15.menuQuinze(dados, loginConta, sc);
 break;
case 16:
	Sixteen menu16 = new Sixteen();
	loginConta = menu16.menuDezesseis(dados, loginConta);
 break;
case 17:
	Seventeen menu17 = new Seventeen();
	loginConta = menu17.menuDezessete(dados, loginConta);
 break;
case 19:
	Nineteen menu19 = new Nineteen();
	loginConta = menu19.menuDezenove(dados, loginConta);
	entradaLogin = 20;
 break;
case 20:
 break;
default:
	System.out.println("Opcao Invalida.");
}*/