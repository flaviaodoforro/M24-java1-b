package br.com.senaisp.bauru.fla.lição01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		double galoes = 15;
		double litros = 0;
		double gal2lt = 3.785;
		//solicitar a entrada via teclado pelo usuario
		System.out.println("digite a quantidade de galões:");
		galoes = scn.nextDouble();
		scn.close();
		//fazendo as contas
		litros = galoes * gal2lt;
		//mostrar resultado
		System.out.println(galoes + " galões equivalem a " + litros +"litros");
	}
	

}
