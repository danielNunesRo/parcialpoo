package entities;

public class Local {
	private Double width;
	private Double heigth;
	
	
	public Local(Double width, Double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
		
	}

	

	public Double getWidth() {
		return width;
	}


	public void setWidth(Double width) {
		this.width = width;
	}


	public Double getHeigth() {
		return heigth;
	}


	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}
	
	public Double getArea() {
		return heigth * width;
	}
	
	public String mostra() {
		return "Largura: " + width + " \nAltura: " + heigth + " \nArea da Festa: " + (heigth * width);
	}
	
}
