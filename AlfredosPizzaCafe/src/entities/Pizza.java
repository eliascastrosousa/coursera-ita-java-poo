package entities;

import java.util.HashMap;

public class Pizza {
	private HashMap <Integer,String>  ingrediente = new HashMap<Integer, String>();
	public static int totalIngredientes = 0;
	private int totalIngredientePizza = 0;
	private double preco = 0;
	
	public static void contabilizaIngrediente() {
		totalIngredientes ++;
	}
	
	public void adicionaIngrediente(int key, String ingrediente){
		this.ingrediente.put(key, ingrediente);
		contabilizaIngrediente();
		totalIngredientePizza++;
	}	
	
	public HashMap<Integer, String> getIngrediente() {
		return ingrediente;
	}
	
	public void setIngrediente(HashMap<Integer, String> ingrediente) {
		this.ingrediente = ingrediente;
	}
	
	public static int getTotalIngredientes() {
		return totalIngredientes;
	}
	
	
	public double getPreco(){
		if (totalIngredientePizza <=2) {
			preco = 15;
		}else if (totalIngredientePizza >2 && totalIngredientePizza <=5) {
			preco = 20;
		}else if (totalIngredientePizza >5) {
			preco = 23;
		}
		else {
			preco = 0;
		}
		return preco;
	}
	
	

	
}
