package testes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import entities.Pizza;

class TestePizza {

	@Test
	void testContabilizaIngrediente() {
		Pizza p = new Pizza();
		p.adicionaIngrediente(1, "mussarela");
		p.adicionaIngrediente(2, "gorgonzola");
		p.adicionaIngrediente(3, "requeijao");
		assertEquals(Pizza.totalIngredientes, 7);
	}
	
	@Test
	void testPrecoPizza() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente(1, "mussarela");
		p1.adicionaIngrediente(2, "gorgonzola");
		p1.adicionaIngrediente(3, "gorgonzolavv");
		p1.adicionaIngrediente(4, "gorgonzolaxx");
		assertEquals(p1.getPreco(), 20);

	}
	

}
