package principal;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno(70, 60, 80, 70);
		System.out.println("Média: "+aluno.media());
		System.out.println("Passou de ano? "+aluno.passouDeAno());
	}

}
