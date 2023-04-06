package ModelFaculdade;

public class Funcionario extends Aluno{
     private int id;
     private String cargo;
     
     
	public Funcionario(int id, String cargo) {
		super();
		this.id = id;
		this.cargo = cargo;
	}


	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
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
     

}
