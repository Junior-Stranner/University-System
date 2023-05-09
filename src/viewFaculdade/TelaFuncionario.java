package viewFaculdade;

import java.io.InputStream;
import java.util.Scanner;

import ModelFaculdade.Funcionario;

public class TelaFuncionario {
    static Scanner in = new  Scanner(System.in);
    static Scanner lerInt = new  Scanner(System.in);

    
    public static void lerDadosFuncionario(Funcionario func){

        System.out.println("ID do FRuncioario");
        int id = Integer.parseInt(in.nextLine());

        System.out.println("Nome do Funcionario");
        String nome  = in.nextLine();

        System.out.println("Idade do Funcionario");
        int idade  = Integer.parseInt(in.nextLine());

        System.out.println("Cargo do Funcionario");
        String cargo  = in.nextLine();

        System.out.println("Salário por Hora");
        float salPorHora  = Float.parseFloat(in.nextLine());

        System.out.println("Horas Trabalhadas");
        float horasTrabalhadas  = Float.parseFloat(in.nextLine());

        func.setId(id);
        func.setNome(nome);
        func.setIdade(idade);
        func.setCargo(cargo);
        func.setSalPorHora(salPorHora);
        func.setHorasTrabalhadas(horasTrabalhadas);

        
    }

    public static int menuFuncionario(){

        System.out.println("Menu Funcionario" 
        +"\n 1 - Novo Funcionário"
        +"\n 2 - calcularSalario"
        +"\n 3 - Lista Funcionário"
        +"\n 4 - Pesquisa Funcionario"
        +"\n 5 - Exclui Funcionário"
        +"\n 6 - Altera Dados"
        +"\n 9 - Voltar ");
        return lerInt.nextInt();
    }

}
