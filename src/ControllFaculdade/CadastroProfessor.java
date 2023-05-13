package ControllFaculdade;

import java.util.ArrayList;
import java.util.Scanner;

import ModelFaculdade.Professor;
import viewFaculdade.TelaProfessor;

public class CadastroProfessor {

    static Scanner in =new Scanner(System.in);
    static Scanner lerInt =new Scanner(System.in);
   static ArrayList<Professor> professores =new ArrayList<>();

    public static void cadastroProfessor(){

       

   int op = 0;

   do{
      op = TelaProfessor.menuCadastroProfessoro();

      switch(op){

        case 1:novoProfessor();break;
        case 2:listaProfessor();break;
        case 3:pesquisarProfessor();break;
        case 4:excluirProfessor();break;
        case 5:alteraDadosProfessor();break;
        case 9:break;   
      }
   }while(op != 9 );

    }
    private static void alteraDadosProfessor() {
        System.out.println("\n escolha as Alteraões seguidas"
        +"\n 1 - Trocar id"
        +"\n 2- Voltar");
        int op = Integer.parseInt(in.nextLine());   

        for (Professor professor : professores) {

            switch(op){
        case 1: System.out.println("Digite um novo Id");
               int nvoId = Integer.parseInt(in.nextLine());

       case 2: break;        
            }
       }
    }
    private static void excluirProfessor() {

        System.out.println(" Digite o Id");
        int id = Integer.parseInt(in.nextLine());
    
        for (Professor professor : professores) {
            if(professor.getId()==id){

            System.out.println("\n Funcionário \n"
            +"\n Id : "+professor.getId()
            +"\n Professor "+professor.getNome()+" foi removido da Instituição");
        
            professores.remove(professor);
            }
        }
    }
    private  static void pesquisarProfessor() {

    System.out.println(" Digite o Id");
    int id = Integer.parseInt(in.nextLine());

    for (Professor professor : professores) {
        if(professor.getId()==id){
        
        System.out.println("\n Funcionário \n"
        +"\n Id : "+professor.getId()
        +"\n Nome : "+professor.getNome()
        +"\n Idade : "+professor.getIdade()
        +"\n Experiencia : "+professor.getExperiencia());
      }
   }
 }
    private static void listaProfessor() {

        for (Professor professor : professores) {
        
            System.out.println("\n Funcionário \n"
            +"\n Id : "+professor.getId()
            +"\n Nome : "+professor.getNome()
            +"\n Idade : "+professor.getIdade()
            +"\n Experiencia : "+professor.getExperiencia());
         }
    }
    private static void novoProfessor() {
        Professor prof = new Professor();
       TelaProfessor.lerDadosProfessor(prof);
       
       professores.add(prof);

    }
    
}
