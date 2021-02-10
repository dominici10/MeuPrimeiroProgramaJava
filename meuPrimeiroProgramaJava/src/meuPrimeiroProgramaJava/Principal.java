/*
*Este programa mostra ao aluno
*1)Que o programa Java é construido dentro de um projeto Java.
*2)Todo programa Java deve ter uma classe com um método main.
*3)Como exibir informações no terminal do Java.
*4)Como ler uma string no terminal de Java.
 */
package meuPrimeiroProgramaJava;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//saudação e pergunta o nome
		System.out.println("Olá amigo!\nQual é o seu nome?");//Uso do println
		
		//saudação especifica para o nome lido
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();

		//Exibir uma string usando printF
		System.out.printf("Olá %s\n", nome, "Seja bem-vindo!");
		in.close();
	}

}
