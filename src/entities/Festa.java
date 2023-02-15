package entities;

public class Festa {
	private String name;
	private int guest;
	private double cost;
	private Local local;

	
	
	
	public Festa(String name, int guest, double cost, Local local) {
		super();
		this.name = name;
		this.guest = guest;
		this.cost = cost;
		this.local = local;
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGuest() {
		return guest;
	}


	public void setGuest(int guest) {
		this.guest = guest;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	
	public String mostra() {
		return "CPF : " + name + " \n" + "Quantidade de Convidados: " + guest + " \n" + "Custo: " + cost;
	}
	
	
	public void classifica () {
		if (guest < 300 && cost < 15000) {
			System.out.println("Festa Junina");
			}
		else if (guest < 300 && cost >= 15000) {
			System.out.println("Aniversário");
		}
		else if (guest >= 300 && cost < 15000) {
			System.out.println("Formatura");
		}
		else if (guest >= 300 && cost >= 15000) {
			System.out.println("Casamento");
		}
	}
	
	public void possivelLocal() {
		double area = local.getArea();
		
		
		if( area >= (guest * 0.75) ) {
			System.out.println("Local comporta o publico, evento poderá ser realizado");
		}
		else {
			System.out.println("Local não comporta o público, evento não será realizado!");
		}
	
	
	
	
	

	
	
}
}