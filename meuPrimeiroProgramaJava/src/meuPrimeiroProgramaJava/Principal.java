/*
*Este programa mostra ao aluno
*1)Que o programa Java � construido dentro de um projeto Java.
*2)Todo programa Java deve ter uma classe com um m�todo main.
*3)Como exibir informa��es no terminal do Java.
*4)Como ler uma string no terminal de Java.
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//sauda��o e pergunta o nome
		System.out.println("Ol� amigo!\nQual � o seu nome?");//Uso do println
		
		//Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		//Exibir uma string usando printF
		System.out.printf("Ol� %s\n", nome, "Seja bem-vindo!");
		in.close();
	}

}
