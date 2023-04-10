package ControllFaculdade;

import java.util.ArrayList;
import java.util.Scanner;

import ModelFaculdade.Funcionario;
import viewFaculdade.TelaAluno;
import viewFaculdade.TelaFuncionario;

public class CadastroFuncionario {

	private static final int TelaFuncionar = 0;
	static Scanner in = new Scanner(System.in);
	static ArrayList<Funcionario> funcs = new ArrayList <Funcionario>();
	
	public static void cadastroFuncionario(){
		
				int op =0;

		do {
			op = TelaFuncionario.menuFuncionario();

			switch(op){
			case 1:novoFuncionqario();break;
			case 2:listaFuncionario();break;
			case 3:pesquisarFuncionario();break;
			case 4:excluirFuncionario();break;
			case 5:alteraDadosFuncionario();break;
			case 9:System.out.println("Finalizar Sistema !!");

			}

		}while(op != 9);

	}

	private static void alteraDadosFuncionario() {

		System.out.println("\n Alterta Dados "
		+"\n 1 - Altera Id"
		+"\n 2 - Altera Cargo");
		int alt = Integer.parseInt(in.nextLine());

		for (Funcionario funcionario : funcs) {

           switch(alt){
			case 1: System.out.println("Digite um novo id");
            int nvId = Integer.parseInt(in.nextLine());

			case 2: System.out.println("Digite um novo Cargo ");
			String nvCargo = in.nextLine();
		   }
		}

	}

	private static void excluirFuncionario() {

		System.out.println("Digite o id do Funcionario");
		int  id = Integer.parseInt(in.nextLine());

		for (Funcionario funcionario : funcs) {
  
			if(funcionario.getId() == id){
				System.out.println("Funcionário : "+funcionario.getNome()+" excluído");

				funcs.remove(funcionario);
			}
		}
	}

	private static void pesquisarFuncionario() {

		System.out.println("Digite o id do Funcionario");
		int  id = Integer.parseInt(in.nextLine());

		for (Funcionario funcionario : funcs) {
  
			if(funcionario.getId() == id){
				System.out.println("Funcionário : "+funcionario.getNome());
			}else
				System.out.println("Funcionário não existe!");
			}
	}


	private static void listaFuncionario(  ) {
        
     for (Funcionario funcionario : funcs) {
        
        System.out.println("\n Funcionário \n"
        +"\n Id : "+funcionario.getId()
        +"\n Nome : "+funcionario.getNome()
        +"\n Idade : "+funcionario.getIdade()
        +"\n Cargo : "+funcionario.getCargo()
        +"\n ");
     }
	}

	private static void novoFuncionqario() {
     Funcionario funcionario = new Funcionario();
     TelaFuncionario.lerDadosFuncionario(funcionario);

     funcs.add(funcionario);
	}
}
