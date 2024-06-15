package br.com.senaisp.bauru.fla.lição06;

import java.util.Random;

public class Baralho {
	private Carta [] cartas;
	private boolean [] cartaUsada;
			//constructor
			public Baralho () {
				cartas = new Carta [Carta.NAIPES.length *
				                    Carta.NUMERO.length];
				cartaUsada = new boolean[cartas.length];
				//inicia
				for(int np=1;np<=Carta.NAIPES.length;np++) {
					for (int nm=1;nm<Carta.NUMERO.length;nm++) {
						int idx = (np-1) * Carta.NUMERO.length + (nm-1);
						cartas[idx] = new Carta(np,nm);
						cartaUsada[idx] = false;
					}
				}
			}
			public Carta sortearCarta() {
				Random rnd = new Random();
				boolean sorteado = false;
				Carta ret = null;
				do {
					int sor = rnd.nextInt(cartas.length);
					if (!cartaUsada[sor]) {
						cartaUsada[sor] = true;
						ret= cartas[sor];
						sorteado = true;
					}
				}while (!sorteado);
				return ret;
				
			}
}
