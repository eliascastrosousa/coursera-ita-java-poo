import java.util.HashMap;

public class Pizza {
	private HashMap<Integer, String> ingrediente = new HashMap<Integer, String>();
	private double preco = 0;
	public static int allIngredientes = 0;
	private int ingredientesPizza = 0;
	
	public HashMap<Integer, String> getIngrediente() {
		return ingrediente;
	}

	public int getIngredientesPizza() {
		return ingredientesPizza;
	}

	public void setIngredientesPizza(int ingredientesPizza) {
		this.ingredientesPizza = ingredientesPizza;
	}

	public double getPreco(){
		if (ingredientesPizza >0 && ingredientesPizza <=2) {
			setPreco(15);
		}else if(ingredientesPizza>2 && ingredientesPizza<=5 ) {
			setPreco(20); 
		}else if(ingredientesPizza>5) {
			setPreco(25); 
		}else {
			setPreco(0);
		}
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void adicionaIngrediente( int key, String ingrediente) {
		this.ingrediente.put(key, ingrediente);
		contabilizaIngrediente();
		ingredientesPizza++;
	}
	
	public static void contabilizaIngrediente() {
		allIngredientes++;
		
	}
	
	public static void zeraIngrediente() {
		allIngredientes = 0;
	}
	
	
	
}
