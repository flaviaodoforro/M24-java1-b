package br.com.senaisp.bauru.fla.lição02;

public class EstudanteTaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante est01 = new Estudante();
		est01.setNome("Nicolas");
		est01.setId(6);
		est01.setMedia(6.9f);
		//mostrando o valor
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento: " +est01.getDocumento()) ;
		//obtendo o objeto como representação textual 
		System.out.println(est01.toString());
		//criando um novo estudante
		Estudante est02 = new Estudante(2, "carlos", "13263773849", 3.6f, 34000.00, true);
		//mostrando
		System.out.println(est02.toString());
	}

}
