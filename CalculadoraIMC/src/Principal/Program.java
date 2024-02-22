package Principal;

import entities.Paciente;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paciente p1 = new Paciente(1.60, 110.00);
		Paciente p2 = new Paciente(1.73, 85.50);
		Paciente p3 = new Paciente(1.73, 69.00);
		
		p1.diagnostico();
		p2.diagnostico();
		p3.diagnostico();
	}

}
