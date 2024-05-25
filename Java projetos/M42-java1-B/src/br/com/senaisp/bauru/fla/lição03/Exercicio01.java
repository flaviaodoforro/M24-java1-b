package br.com.senaisp.bauru.fla.lição03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o valor da base do " + "triangulo");
		float base = sc.nextFloat();
		System.out.println(" digite a altura do triangulo");
		float altura = sc.nextFloat();
		float area = base * altura / 2;
		System.out.println("area do triangulo é " + area);
		//fechando o traco
		sc.close();
		
		
		
	}

}
