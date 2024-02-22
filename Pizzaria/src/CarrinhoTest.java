import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CarrinhoTest {
	
	@Test
	void addPizzaAoCarrinhotest() {	
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		
		p1.adicionaIngrediente(1, "chocolate");		
		p2.adicionaIngrediente(1, "queijo");
		cc.addPizzaAoCarrinho(p1);
		cc.addPizzaAoCarrinho(p2);
		assertEquals(2, cc.getPizzas().size());
	}

	@Test
	void precoTotalDoCarrinhotest() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		p1.adicionaIngrediente(1, "chocolate");
		cc.addPizzaAoCarrinho(p1);
		cc.addPizzaAoCarrinho(p2);
		assertEquals(15, cc.getPrecoTotal());
	}

	
	
}
