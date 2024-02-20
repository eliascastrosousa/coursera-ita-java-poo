package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.CarrinhoDeCompras;
import entities.Pizza;

class TesteCarrinho {

	@Test
	void testCarrinhoAddPizza() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		
		p1.adicionaIngrediente(1, "mussarela");
		p1.adicionaIngrediente(2, "gorgonzola");
		p1.adicionaIngrediente(3, "requeijao");
		p1.adicionaIngrediente(4, "calabresa");
		cc.addPizza(p1);
		cc.addPizza(p2);	
		assertEquals(cc.getPrecoTotal() , 20);
	}
	
	@Test
	void testCarrinhoPrecoTotal() {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		
		p1.adicionaIngrediente(1, "mussarela");
		p1.adicionaIngrediente(2, "gorgonzola");
		p1.adicionaIngrediente(3, "requeijao");
		p1.adicionaIngrediente(4, "calabresa");
		
		cc.addPizza(p1);
		cc.addPizza(p2);
				
		assertEquals(cc.totalDePizzas() , 1);
		

	}

}
