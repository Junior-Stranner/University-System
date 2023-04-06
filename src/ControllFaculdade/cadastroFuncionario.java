package ControllFaculdade;

import java.util.ArrayList;
import java.util.Scanner;

import ModelFaculdade.Funcionario;
import viewFaculdade.TelaAluno;

public class cadastroFuncionario {

	static Scanner in = new Scanner(System.in);
	static ArrayList<Funcionario> funcs = new ArrayList <Funcionario>();
	
	public static void cadastroFuncionario(){
		
				int op =0;

		do {
			op = TelaAluno.menuCadastroAluno();

			switch(op){
			case 1:novoFuncionario();break;
			case 2:funcõesFuncionario();break;
			case 3:listaFuncionario();break;
			case 4:pesquisarFuncionario();break;
			case 5:excluirFuncionario();break;
			case 6:alteraDadosFuncionario();break;

			}

		}while(op != 9);

	}

	private static void alteraDadosFuncionario() {
		// TODO Auto-generated method stub
		
	}

	private static void excluirFuncionario() {
		// TODO Auto-generated method stub
		
	}

	private static void pesquisarFuncionario() {
		// TODO Auto-generated method stub
		
	}

	private static void listaFuncionario() {
		// TODO Auto-generated method stub
		
	}

	private static void funcõesFuncionario() {
		// TODO Auto-generated method stub
		
	}

	private static void novoFuncionario() {
		// TODO Auto-generated method stub
		
	}
		
		
	}
}
