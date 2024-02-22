
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		Pizza p4 = new Pizza();

		// choconana 15
		p1.adicionaIngrediente(1,"banana");
		p1.adicionaIngrediente(2,"chocolate");

		// baiana 25
		p2.adicionaIngrediente(1, "mussarela");
		p2.adicionaIngrediente(2, "calabresa");
		p2.adicionaIngrediente(3, "tomate");
		p2.adicionaIngrediente(4, "oregano");
		p2.adicionaIngrediente(5, "ovo");
		p2.adicionaIngrediente(6, "molho de pimenta");
		
		// frango 20
		p3.adicionaIngrediente(1,"frango");
		p3.adicionaIngrediente(2,"requeijao");
		p3.adicionaIngrediente(3,"bacon");
		
		// adicionando ao carrinho
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.addPizzaAoCarrinho(p1);
		cc.addPizzaAoCarrinho(p2);
		cc.addPizzaAoCarrinho(p3);
		cc.addPizzaAoCarrinho(p4);
		
		cc.getPrecoTotal();
		System.out.println("quantidade utilizada de cada ingrediente: " + Pizza.allIngredientes);
		cc.imprimeTotal();
		
		
	}

}
