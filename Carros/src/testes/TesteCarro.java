package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Carro;

class TesteCarro {

	@Test
	public void testAcelerar() {
		Carro c = new Carro();
		c.setPotencia(10);
		c.acelerar();
		assertEquals(10,c.getVelocidade());
	}
	
	@Test
	public void testCarroParado() {
		Carro c = new Carro();
		assertEquals(0,c.getVelocidade());
	}
	
	@Test
	public void testFrearCarro() {
		Carro c = new Carro();
		c.setPotencia(10);
		c.acelerar();
		c.frear();
		assertEquals(5,c.getVelocidade());
	}
	
	@Test
	public void testFrearCarroAteParar() {
		Carro c = new Carro();
		c.setPotencia(10);
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0,c.getVelocidade());
	}

}
