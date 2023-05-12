package ControllFaculdade;

import java.util.ArrayList;
import java.util.Scanner;

import ModelFaculdade.Professor;
import viewFaculdade.TelaProfessor;

public class CadasstroProfessor {

    static Scanner lerInt =new Scanner(System.in);
    private Professor[] professores;
    public void cadasstroProfessor(){

        ArrayList<Professor> professores =new ArrayList<>();

   int op = 0;

   do{
      op = TelaProfessor.menuCadastroProfessoro();

      switch(op){

        case 1:novoProfessor(professores);break;
        case 2:listaProfessor(professores);break;
        case 3:pesquisarProfessor(professores);break;
      }
   }while(op != 0 );

    }
    private void pesquisarProfessor(ArrayList<Professor> professores) {



    }
    private void listaProfessor( ArrayList<Professor> professores ) {

        for (Professor prof : professores) {
        
            System.out.println("\n Funcionário \n"
            +"\n Id : "+prof.getId()
            +"\n Nome : "+prof.getNome()
            +"\n Idade : "+prof.getIdade()
            +"\n Experiencia : "+prof.getExperiencia());
         }
    }
    private void novoProfessor( ArrayList<Professor> professores ) {
        Professor prof = new Professor();
       TelaProfessor.lerDadosProfessor(prof);
       
       professores.add(prof);

    }
    
}
