import java.util.ArrayList;

public class CarrinhoDeCompras {
	private ArrayList<Pizza> pizzas = new ArrayList <Pizza>();
	private double precoTotal = 0;
	
	public void addPizzaAoCarrinho(Pizza p) {
		if(p.getIngrediente().isEmpty()) {
			
		}else {
			pizzas.add(p);
		}
		
	}
	
	public ArrayList<Pizza> getPizzas() {
		return pizzas;
	}

	public double getPrecoTotal() {
		calculadoraTotal();
		return precoTotal;
	}

	public void calculadoraTotal() {
		for (int i = 0; i < pizzas.size(); i++) {
			precoTotal += pizzas.get(i).getPreco();
		}
	}
	
	public void imprimeTotal() {
		System.out.println("Total do carrinho de compras: R$" + precoTotal);
	}
}
