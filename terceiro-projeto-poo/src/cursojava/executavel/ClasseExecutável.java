package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

import cursojava.classes.Disciplina;

public class ClasseExecutável {

	public static void main(String[] args) {


		Aluno aluno4 = new Aluno();
		
	String nomeAluno4 = JOptionPane.showInputDialog("Qual o nome do aluno? ");
	String dateNascimentoAluno4 = JOptionPane.showInputDialog("Qual a data de nascimento do aluno? ");
	
	
	for (int pos = 1; pos <=2; pos ++) {
	
		String nomeDisciplina1 = JOptionPane.showInputDialog("Qual o nome da " +pos+ " disciplina? ");
		String notaDisciplina1 = JOptionPane.showInputDialog("Qual a Nota da " +pos+ " disicplina? ");
	
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina(nomeDisciplina1);
		disciplina1.setNota(Double.parseDouble(notaDisciplina1));
		
		aluno4.getDisciplinas().add(disciplina1);
	}
	
		
	aluno4.setNome(nomeAluno4);
	aluno4.setDataNascimento(dateNascimentoAluno4);
	
	
	System.out.println("O nome do Aluno 4 é: " + aluno4.getNome());
	System.out.println("A data de Nascimento do Aluno 4 é: " + aluno4.getDataNascimento());
	System.out.println("A média do " + aluno4.getNome() + " é: " + aluno4.getMediaNota() + 
			" e ele está:" + aluno4.getAlunoAprovado()); 
	
	

}
}	
