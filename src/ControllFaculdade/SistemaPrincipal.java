package ControllFaculdade;

import viewFaculdade.TelaPrincipal;

public class SistemaPrincipal {

    public void sistemaPrincipal(){

    int op = 0;

    op = TelaPrincipal.menuPrincipal();

    do{
        switch(op){

            case 1:CadastroAluno.cadastroAluno();
            case 2:CadastroFuncionario.cadastroFuncionario();
            case 3:
            case 4:
        }

    }while(op != 4);    
}
}
