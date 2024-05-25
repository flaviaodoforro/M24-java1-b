package br.com.senaisp.bauru.fla.lição04;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String nome1 = "sarah";
		String nome2 = "sarah";
		System.out.println("diga seu nome praga");
		nome2= sc.next();
		if (nome1 == nome2) {
			System.out.println("sao ingauis");
			}
		else {
			System.out.println("são diferentes");
		}
		if (nome1.compareTo(nome2)>0) {
			System.out.println("nome1 é maior que 2");
		}
		if (nome1.compareTo(nome2)<0) {
			System.out.println("nome2 é maior que 1");
	}
		if (nome1.compareTo(nome2)==0) {
			System.out.println("nome1 é igual que 2");
		}
		sc.close();
	}

}
