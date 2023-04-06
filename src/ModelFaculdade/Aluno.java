package ModelFaculdade;

public class Aluno {
	private int matricula;
	private int idade;
	private String nome;
	private String curso;
	private double nota1,nota2,nota3,media;
	private String conselho = ""; 


	@Override
	public String toString() {
		return "\n Aluno \n matricula=" + matricula 
				+ "\n idade " + idade 
				+ "\n nome " + nome 
				+ "\n curso " + curso 
				+ "\n nota1 " +nota1 
				+ "\n nota2 " + nota2 
				+ "\n nota3 " + nota3
				+ "\n \n media " +media
				+ "\n Conselho "+conselho;
	}
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aluno(int matricula, int idade, String nome, String curso, double nota1, double nota2, double nota3,
			double media) {
		super();
		this.matricula = matricula;
		this.idade = idade;
		this.nome = nome;
		this.curso = curso;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media = media;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String GetConselho() {
		return conselho;
	}
	public void setConselho(String conselho) {
		this.conselho = conselho;   
	}
}