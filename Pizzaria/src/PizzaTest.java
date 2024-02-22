

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PizzaTest {
	
	@BeforeAll
	public static void testContabilizaIngredientesPizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente(5, "queijo minas");
	}
	
	@Test
	public void testPrecoPizza0() {
		Pizza p3 = new Pizza();
		assertEquals(p3.getPreco(), 0);
	}
	
	@Test
	public void testPrecoPizza15() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente(1, "mussarela");
		p1.adicionaIngrediente(2, "requeijao");
		assertEquals(p1.getPreco(), 15);
	}
	
	@Test
	public void testPrecoPizza20() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente(1, "mussarela");
		p2.adicionaIngrediente(2, "requeijao");
		p2.adicionaIngrediente(3, "tomate");
		assertEquals(p2.getPreco(), 20);
	}

	@Test
	void testContabilizaIngredientesGeral() {
		assertEquals(Pizza.allIngredientes, 6);
	}

	@AfterAll
	public static void testZeraIngredientesGeral() {
		Pizza.zeraIngrediente();
		System.out.println(Pizza.allIngredientes);
	}
	
	
	
}
