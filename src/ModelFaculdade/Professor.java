package ModelFaculdade;

public class Professor extends Aluno{
	private String  aExperiencia;
	

	
	public Professor( String aExperiencia) {
		super();
		this.aExperiencia = aExperiencia;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getaExperiencia() {
		return aExperiencia;
	}

	public void setaExperiencia(String aExperiencia) {
		this.aExperiencia = aExperiencia;
	}
	
	
}
