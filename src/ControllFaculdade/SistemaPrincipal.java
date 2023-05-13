package ControllFaculdade;

import viewFaculdade.TelaPrincipal;

public class SistemaPrincipal {

    public static void sistemaPrincipal(){

    int op = 0;

    op = TelaPrincipal.menuPrincipal();

    do{
        switch(op){

            case 1:CadastroAluno.cadastroAluno();
            case 2:CadastroFuncionario.cadastroFuncionario();
            case 3:CadastroProfessor.cadastroProfessor();
            case 4:System.out.println("Finalizar Sistema");
        }

    }while(op != 4);    
}
}
