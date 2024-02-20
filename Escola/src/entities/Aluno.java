package entities;

public class Aluno {
	public int bim1;
	public int bim2;
	public int bim3;
	public int bim4;
	
	public Aluno(int bim1, int bim2, int bim3, int bim4) {
		super();
		this.bim1 = bim1;
		this.bim2 = bim2;
		this.bim3 = bim3;
		this.bim4 = bim4;
	}
	
	

	public int getBim1() {
		return bim1;
	}



	public void setBim1(int bim1) {
		this.bim1 = bim1;
	}



	public int getBim2() {
		return bim2;
	}



	public void setBim2(int bim2) {
		this.bim2 = bim2;
	}



	public int getBim3() {
		return bim3;
	}



	public void setBim3(int bim3) {
		this.bim3 = bim3;
	}



	public int getBim4() {
		return bim4;
	}



	public void setBim4(int bim4) {
		this.bim4 = bim4;
	}



	public int media() {
		int total = 0;
		total +=bim1;
		total += bim2;
		total += bim3;
		total += bim4;
		return total/4;
	}
	
	public boolean passouDeAno() {
		if(media() >= 60)
			return true;
		return false;
	}
}
