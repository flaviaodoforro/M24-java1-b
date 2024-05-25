package br.com.senaisp.bauru.fla.lição02;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome completo: ");
		nome = scn.nextLine();
		//vamos separar nome de sobrenome
		String primeiroNome = nome.substring(0,(nome+" ").indexOf(" "));
		//pegar o ultimo sobrenome
		String lastName = nome.substring(nome.lastIndexOf("  ")+1);
		System.out.println(primeiroNome);
		System.out.println(lastName);
		//fechando o scn
		scn.close();
		
 
	}

}
