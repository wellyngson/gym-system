package main;

import java.util.ArrayList;
import java.util.Scanner; 
import usuarios.Usuario;
import pacote.Pacote;

/**
 * @author welly
 */

public class Main {

	private static Scanner scn;

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
//				CRIA��O DO SCANNER GLOBAL QUE DEFINIR� AS A��ES ESCOLHIDAS PELO USU�RIO
				String condition;
				
//				CRIA��O DO ARRAYLIST DOS ALUNOS CADASTRADOS
				ArrayList<Usuario> alunosCadastrados = new ArrayList<Usuario>();

				do {

//					CRIA��O DE OBJETOS: Scanner local, Plano A, Plano B					
					scn = new Scanner(System.in);
					Pacote planoA = new Pacote("Plano A");
					Pacote planoB = new Pacote("Plano B");
					
					
//					INICIO DA INTERA��O COM O USU�RIO
					System.out.println ("\nCONTROLE ACADEMIA\n\n" 
										+ "1. Cadastra alunos\n" 
										+ "2. Listas todos os alunos\n"
										+ "3. Sair\n");
					
					System.out.print("Informe o que deseja fazer: ");
					condition = sc.next();
					
					switch (condition) {
					
						case "1":
//						CADASTRAR OS ALUNOS
//						INSER��O DOS DADOS DO USU�RIO
							
							System.out.print("\n" + "Nome: ");
							String name = scn.nextLine();
							
							System.out.print("CPF: ");
							String cpf = scn.nextLine();
							
							System.out.print("Idade: ");
							int years = scn.nextInt();
							
							System.out.print("Altura: ");
							float height = scn.nextFloat();
							
							System.out.print("Peso: ");
							float weight = scn.nextFloat();

							System.out.println(planoA);
							System.out.println(planoB);
							
							scn.nextLine();
							System.out.print("Insira seu plano: ");
							String plans = scn.nextLine();
							
							System.out.print("Status: ");
							String status = scn.nextLine();
							
							Usuario usuario = new Usuario(name, cpf, years, height, weight, status, plans);
							alunosCadastrados.add(usuario);
							
							break;
							
						case "2":
							
//						LISTAR OS ALUNOS							
							for (int i = 0; i < alunosCadastrados.size(); i++) {
								System.out.println(alunosCadastrados.get(i));
							}
							
//						SOMAR ALUNOS ATIVOS E INATIVOS
							int alunosAtivos, alunosInativos;
							alunosAtivos = 0;
							alunosInativos = 0;
							
							for (int i = 0; i < alunosCadastrados.size(); i++) {
								if (alunosCadastrados.get(i).getStatus().toLowerCase().equals("ativo")) {
									alunosAtivos++;
								} else {
									alunosInativos++;
								}
							}

							System.out.println("\n" + "A quantidade de alunos ativos �/s�o: " + alunosAtivos);
							System.out.println("A quantidade de alunos inativos �/s�o: " + alunosInativos + "\n");
							
							break;
										
						case "3":
//						ENCERRAR O PROGRAMA
							System.out.println("\n" + "Obrigado por utilizar nosso sistema!");
							System.exit(0);
										
						default:
							System.out.println("N�o foi poss�vel realizar essa opera��o");
							break;
					}
					
					System.out.print("Deseja realizar outra opera��o? (Sim/Nao)\n");
					condition = sc.next();
					
				
				} while (!condition.toLowerCase().equals("nao"));
			
			System.out.println("\n" + "OBRIGADO POR USAR NOSSO SISTEMA");
		
			
			sc.close();
	}
}