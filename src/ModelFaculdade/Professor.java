package ModelFaculdade;

public class Professor extends Aluno{
	private int id;
	private String  experiencia;
	

	
	public Professor(int id, String experiencia) {
		super();
		this.id = id;
		this.experiencia = experiencia;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
