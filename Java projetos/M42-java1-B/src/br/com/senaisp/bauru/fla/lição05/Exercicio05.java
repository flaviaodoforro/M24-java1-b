package br.com.senaisp.bauru.fla.lição05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Forca fo = new Forca();
		fo.mostrarForca();
		String palavra="";
		while (fo.isTerminado()) {
			System.out.println("Digite uma letra:");
			palavra = sc.nextLine();
			if (fo.verificaLetra(palavra.charAt(0))) {
				System.out.println("Letra não encontrada!");
			}
			fo.mostrarForca();
		}
		sc.close();
		System.out.println("A palavra secreta era " +
		fo.mostrarPalavra());
	}

}
