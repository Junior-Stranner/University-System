package viewFaculdade;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;

import ModelFaculdade.Professor;

public class TelaProfessor {

    static Scanner in = new Scanner(System.in);
	static Scanner lerInt = new Scanner(System.in);
	

	public static void lerDadosASluno(Professor professor) {
		
		System.out.println("Id do Professor : ");
		int id = Integer.parseInt(in.nextLine());
	
		System.out.println("Nome do Professor : ");
		String nome = in.nextLine();
		
		System.out.println("Idade do Professor: ");
		int idade = Integer.parseInt(in.nextLine());
		
		System.out.println(" Experiência : ");
		String experiência =in.nextLine();
		
		professor.setId(id);
        professor.setNome(nome);
        professor.setIdade(idade);
        professor.setaExperiencia(experiência);
            
        }
		
	//	System.out.println("Média : "+media);
		

  public static int menuCadastroAluno() {
	  System.out.println("\n Cadastro Aluno \n"
	  		+ "\n 1 - Novo Professor"
	  		+ "\n 2 - lista Professor"
	  		+ "\n 3 - Pesquisar Professor"
	  		+ "\n 4 - exclui Professor"
	  		+ "\n 5 - Altera Dados Professor"
	  		+ "\n 9 - cancelar!!!");
	return lerInt.nextInt();
	  
}  
    
}
