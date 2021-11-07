package cursojava.classes;

public class Disciplina {

	Double nota;
	String disciplina;
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return  disciplina ;
	}
	
	
	
	
	
}
