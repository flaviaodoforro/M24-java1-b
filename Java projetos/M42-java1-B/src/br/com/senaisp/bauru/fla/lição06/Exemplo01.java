package br.com.senaisp.bauru.fla.lição06;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] valores;
		System.out.println("digite o numero de elementos" + "que voce deseja");
		int qtde = sc.nextInt();
		valores = new int[qtde];
		//laço de rep
		for(int i=0;i<valores.length;i++) {
			System.out.println("digite o elemento" +(i+1) + ":");
			valores [i] = sc.nextInt();
			
		}
		int maior=Integer.MIN_VALUE, soma=0;
		for(int el : valores) {
			soma += el;
			if (el>maior) {
				maior = el;
			}
		}
		System.out.println("maior valor é " + maior);
		System.out.println("media: " + (soma * 1.0/ valores.length));
		System.out.println("soma: "+ soma);
		sc.close();
	}

}
