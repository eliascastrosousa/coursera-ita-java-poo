package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Paciente;

class TestPaciente {

	@Test
	void testcalcularIMC() {
		Paciente p = new Paciente(2, 5);
		assertEquals(1.25, p.calcularIMC());
	}
	
	@Test
	void testGetHeight() {
		Paciente p = new Paciente(2, 5);
		assertEquals(5, p.getWeight());
	}
	
	@Test
	void testGetWeight() {
		Paciente p = new Paciente(2, 5);
		assertEquals(2, p.getHeight());
	}
	
	@Test
	void testBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(1.80, 44);
		System.out.println("\ntest Baixo Peso Muito Grave");
		assertEquals(1,p.diagnostico());
	}
	
	@Test
	void testBaixoPesoGrave() {
		Paciente p = new Paciente(1.80, 55);
		System.out.println("\ntest Baixo Peso Grave");
		assertEquals(2,p.diagnostico());
	}
	
	@Test
	void testBaixoPeso() {
		Paciente p = new Paciente(1.80, 57);
		System.out.println("\ntest Baixo peso ");
		assertEquals(3,p.diagnostico());
	}
	
	@Test
	void testPesoNormal() {
		Paciente p = new Paciente(1.80, 60);
		System.out.println("\ntest Peso normal ");
		assertEquals(4,p.diagnostico());
	}
	
	@Test
	void testSobrepeso() {
		Paciente p = new Paciente(1.80, 85);
		System.out.println("\ntest Sobrepeso ");
		assertEquals(5,p.diagnostico());
	}
	
	@Test
	void testObesidadeGrauI() {
		Paciente p = new Paciente(1.80, 100);
		System.out.println("\ntest Obesidade Grau I");
		assertEquals(6,p.diagnostico());
	}
	
	@Test
	void testObesidadeGrauII() {
		Paciente p = new Paciente(1.80, 120);
		System.out.println("\ntest Obesidade Grau II ");
		assertEquals(7,p.diagnostico());
	}
	
	@Test
	void testObesidadeGrauIII() {
		Paciente p = new Paciente(1.80, 200);
		System.out.println("\ntest Obesidade Grau III ");
		assertEquals(8,p.diagnostico());
	}

}
