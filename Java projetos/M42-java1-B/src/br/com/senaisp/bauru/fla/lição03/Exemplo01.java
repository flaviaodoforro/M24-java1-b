package br.com.senaisp.bauru.fla.lição03;

public class Exemplo01 {
	public static int idade = 17;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte vByte = 127;
		vByte++; //aqui ocorre o estouro do limite do byte
		System.out.println(vByte);//mostra o limite anterior
		float vFloat = 6_000.00f;//preciso colocar f para dizer que é float
		if (vByte == -128) {
			String nome = "sarah";
			System.out.println("meu nome é" + nome);
			
		}
	//System.out.println(nome);//fora do if ela não existe
		//alterando idade
		idade = 20;
		System.out.println(idade);
		int idade = 50;
		System.out.println(idade);
		idade += 20;
		System.out.println(idade);
		int a = 10;
		int b = a++;
		int c = ++a;
			System.out.println("a"+a);
			System.out.println("b"+b);
			System.out.println("c"+c);
			double total = (double)++a /2;
			System.out.println(total);
		char letraA = 'a';
		char letraS = 's';
		char letraR = 'r';
		char letraH = 'h';
		System.out.println(letraA);
		System.out.println("" + letraS +letraA + letraR + letraA + letraH);
		
	}

}