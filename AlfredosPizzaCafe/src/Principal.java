import java.util.Locale;
import java.util.Scanner;

import entities.CarrinhoDeCompras;
import entities.Pizza;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//pizza 1 
		p1.adicionaIngrediente(15, "Calabresa");
		p1.adicionaIngrediente(20, "Cebola");
		
		//pizza 2
		p2.adicionaIngrediente(4, "Requeijao");
		p2.adicionaIngrediente(2, "Mussarela");
		p2.adicionaIngrediente(5, "Parmesao");
				
		//pizza 3
		p3.adicionaIngrediente(7, "Frango");
		p3.adicionaIngrediente(6, "Catupiry");
		p3.adicionaIngrediente(8, "ovo");
		p3.adicionaIngrediente(15, "calabresa");
		p3.adicionaIngrediente(2, "Mussarela");
		p3.adicionaIngrediente(20, "Cebola");

		cc.addPizza(p1);
		cc.addPizza(p2);
		cc.addPizza(p3);
		
		System.out.println("BEM VINDO AO ALFREDO'S PIZZA CAFE");
		System.out.println("Resumo do pedido: ");
		System.out.println("Total de Pizzas: "+ cc.totalDePizzas());
		System.out.println("Valor total do Carrinho: " + cc.getPrecoTotal());
		System.out.println("Total de ingredientes utilizados: " + Pizza.getTotalIngredientes());
		
		sc.close();
		
	}

}
