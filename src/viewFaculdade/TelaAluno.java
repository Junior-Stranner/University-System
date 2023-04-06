package viewFaculdade;

import java.util.Scanner;

import ModelFaculdade.Aluno;

public class TelaAluno {
	
	static Scanner in = new Scanner(System.in);
	static Scanner lerInt = new Scanner(System.in);
	

	public static void lerDadosASluno(Aluno aluno) {
		double media = 0;
		
		System.out.println("Matrcicula : ");
		int matricula = Integer.parseInt(in.nextLine());
	
		System.out.println("Nome do Aluno : ");
		String nome = in.nextLine();
		
		System.out.println("Idade : ");
		int idade = Integer.parseInt(in.nextLine());
		
		System.out.println("Curso : ");
		String curso =in.nextLine();
		
		System.out.println("Digite nota 1");
		double nota1 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite nota 2");
		double nota2 = Double.parseDouble(in.nextLine());
		
		System.out.println("Digite nota 3");
		double nota3 = Double.parseDouble(in.nextLine());
		
	//	System.out.println("Média : "+media);
		
		aluno.setMatricula(matricula);
		aluno.setNome(nome);
		aluno.setIdade(idade);
		aluno.setCurso(curso);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setNota3(nota3);
		aluno.setMedia(0.0);
		
  
	}
  public static int menuCadastroAluno() {
	  System.out.println("\n Cadastro Aluno \n"
	  		+ "\n 1 - Novo Aluno"
	  		+ "\n 2 - Calcular Média"
	  		+ "\n 3 - lista Aluno"
	  		+ "\n 4 - Pesquisar Aluno"
	  		+ "\n 5 - exclui Aluno"
	  		+ "\n 6 - Altera Dados Aluno"
	  		+ "\n 9 - cancelar!!!");
	return lerInt.nextInt();
	  
}
}
