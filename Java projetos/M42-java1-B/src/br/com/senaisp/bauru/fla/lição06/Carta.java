package br.com.senaisp.bauru.fla.lição06;

public class Carta {
	public static final  String[] NAIPES = {"♦","♠","♥","♣"};
	public static final String [] NUMERO = {
			"A","2","3","4","5","6","7","8","9","10",
			"J","Q","K"};
	private String naipe;
	private String numero;
	//CONSTRUCTOR
	public Carta (int np, int vl) {
		if (np<1 || np>4) {
			System.out.println("naipe invalido!");
		}
		if (vl<1 || vl>13) {
			System.out.println("numero da carta invalido");
		}
		naipe = NAIPES [np-1];
		numero = NUMERO [vl-1];
	}
	@Override
	public String toString() {
		// ┌─┐│└┘     1234567
		String txt = "┌────n"+
					 "│##  n"+
					 "│  § ";
		txt = txt.replaceFirst("##", numero);
		txt = txt.replace("§", naipe);
		txt = txt.replaceFirst("##", numero);
		
		return txt;		
	}
} 
