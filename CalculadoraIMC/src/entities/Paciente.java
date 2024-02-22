package entities;

public class Paciente {
	private double height;
	private double weight;
	private int grauDiagnostico;
	
	public Paciente(double height, double weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double calcularIMC() {
		return getWeight()/(getHeight()*getHeight());
	}
	
	public int diagnostico() {
		
		if (calcularIMC() < 16) {
			System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
			grauDiagnostico = 1;
		} 
		else if (calcularIMC() >= 16 && calcularIMC() < 17) {
			System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
			grauDiagnostico = 2;
		}
		else if (calcularIMC() >= 17 && calcularIMC() < 18.50) {
			System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m²");
			grauDiagnostico = 3;
		}
		else if (calcularIMC() >= 18.50 && calcularIMC() < 25) {
			System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
			grauDiagnostico = 4;
		}
		else if (calcularIMC() >= 25 && calcularIMC() < 30) {
			System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
			grauDiagnostico = 5;
		}
		else if (calcularIMC() >= 30 && calcularIMC() < 35) {
			System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
			grauDiagnostico = 6;
		}
		else if (calcularIMC() >= 35 && calcularIMC() < 40) {
			System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
			grauDiagnostico = 7;
		}
		else {
			System.out.println("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
			grauDiagnostico = 8;
		}
		
		return grauDiagnostico;
		
		}
}
