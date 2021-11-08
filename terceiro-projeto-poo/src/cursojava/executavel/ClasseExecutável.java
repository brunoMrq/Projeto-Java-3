package cursojava.executavel;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

import cursojava.classes.Disciplina;

public class ClasseExecutável {

	public static void main(String[] args) {


		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int i = 1; i<=2; i++) {
		
		Aluno aluno4 = new Aluno();
			
	String nomeAluno4 = JOptionPane.showInputDialog("Qual o nome do aluno " +i+ " ?");
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
	
	int escolha = JOptionPane.showConfirmDialog(null, " Deseja Remover alguma disciplina? ");
	if (escolha == 0) {
		int continuarRemover = 0;
		int posicao = 1;
		while(continuarRemover == 0) {
		String escolhaDisciplina = JOptionPane.showInputDialog("Deseja remover a disciplina 1,2,3 ou 4? ");
		aluno4.getDisciplinas().remove((Integer.parseInt(escolhaDisciplina)-posicao));
		posicao ++;
		continuarRemover = JOptionPane.showInternalConfirmDialog(null, "Continuar a remover? ");
	}
	}
	
		alunos.add(aluno4);
		}
		
	for (Aluno aluno : alunos) {
		
		System.out.println("O nome do Aluno é: " + aluno.getNome());
		System.out.println("A data de Nascimento do Aluno é: " + aluno.getDataNascimento());
		System.out.println("A média do " + aluno.getNome() + " é: " + aluno.getMediaNota() + 
				" e ele está:" + aluno.getAlunoAprovado()); 
		System.out.println("E suas disciplinas são: ");
		for (Disciplina disciplinas : aluno.getDisciplinas()) {
			System.out.println(disciplinas.getDisciplina() + " com nota: " + disciplinas.getNota());
		}
		System.out.println("---------------------------------------------------------------------");
		
	}	
	

}
}	
