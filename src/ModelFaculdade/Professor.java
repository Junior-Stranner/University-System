package ModelFaculdade;

public class Professor extends Aluno{
	private int id;
	private String  experiencia;
	

	
	public Professor(int id, String aExperiencia) {
		super();
		this.id = id;
		this.experiencia = aExperiencia;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Professor [id=" + id + ", aExperiencia=" + experiencia + "]";
	}

	public String getaExperiencia() {
		return experiencia;
	}

	public void setaExperiencia(String aExperiencia) {
		this.experiencia = aExperiencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
