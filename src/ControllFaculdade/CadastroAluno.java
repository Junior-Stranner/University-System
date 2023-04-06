package ControllFaculdade;

import java.util.ArrayList;
import java.util.Scanner;

import ModelFaculdade.Aluno;
import viewFaculdade.TelaAluno;

public class CadastroAluno {

	static Scanner in = new Scanner(System.in);
	static ArrayList<Aluno> alunos = new ArrayList <Aluno>();

	public static void cadastroAluno() {

		int op =0;

		do {
			op = TelaAluno.menuCadastroAluno();

			switch(op){
			case 1:novoAluno();break;
			case 2:calcularMedia();break;
			case 3:listaAluno();break;
			case 4:pesquisarAluno();break;
			case 5:excluirAluno();break;
			case 6:alteraDadosAluno();break;

			}

		}while(op != 9);

	}
	public static  void calcularMedia() {
		for (Aluno aluno : alunos) {

			aluno.setMedia(( aluno.getNota1()+ aluno.getNota2() + aluno.getNota3())/3); 

			if(aluno.getMedia()>= 6) {
				aluno.setConselho( "Aprovado") ;
			}else {
				aluno.setConselho("Reprovado");		
			}
		}
	}

	private static void alteraDadosAluno() {

		System.out.println("\n Digite as opcões a seraletrada "
				+ "\n 1 - Alterar nota 1"
				+ "\n 2 - Alterar nota 2"
				+ "\n 3 - Alterar nota 3");
	}

	private static void excluirAluno() {

		System.out.println("Digite o Número  da Màtricula");
		int nvaMatricula = Integer.parseInt(in.nextLine());

		for (Aluno aluno : alunos) {
			if(aluno.getMatricula() == nvaMatricula) {
				System.out.println("\n Aluno Excluído");

				alunos.remove(aluno);
			}	
		}

	}

	private static void pesquisarAluno() {
		// TODO Auto-generated method stub
		System.out.println("Matriclua do Aluno");
		int nvaMatricula = Integer.parseInt(in.nextLine());

		for (Aluno aluno : alunos) {
			if(aluno.getMatricula() == nvaMatricula) {
				System.out.println(" \n Aluno Encontrado"
						+ "\n Aluno : "+aluno.getNome());
			}else 
				System.out.println("Aluno não existe !!");
		}

	}

	private static void listaAluno() {
		// TODO Auto-generated method stub
		System.out.println(alunos);

	}

	private static void novoAluno() {
		Aluno aluno = new Aluno();
		TelaAluno.lerDadosASluno(aluno);

		alunos.add(aluno);
	}

}
