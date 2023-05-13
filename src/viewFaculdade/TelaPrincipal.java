package viewFaculdade;

import java.util.Scanner;

public class TelaPrincipal {

    static Scanner lerInt = new Scanner(System.in);

    public static int menuPrincipal(){
    
    System.out.println("\n Cadastro"
    +"\n 1 - Aluno"
    +"\n 2 - Funcionario"
    +"\n 3 - Professor"
    +"\n 4 - Finalizar Sistema ");
    return lerInt.nextInt();

    }
}
