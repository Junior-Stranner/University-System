package ModelFaculdade;

public class Funcionario extends Aluno{
     private int id;
     private String cargo;
	 private float salPorHora;
	 private float horasTrabalhadas;

	 public double salario(){
		return salPorHora * horasTrabalhadas;

	 }

	 
	public Funcionario(int id, String cargo, float salPorHora, float horasTrabalhadas) {
		this.id = id;
		this.cargo = cargo;
		this.salPorHora = salPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Funcionario(int matricula, int idade, String nome, String curso, double nota1, double nota2, double nota3,
			double media, int id, String cargo, float salPorHora, float horasTrabalhadas) {
		super();
		this.id = id;
		this.cargo = cargo;
		this.salPorHora = salPorHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public Funcionario() {
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public float getSalPorHora() {
		return salPorHora;
	}
	public void setSalPorHora(float salPorHora) {
		this.salPorHora = salPorHora;
	}
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
     
}    
	