package forms;

public class Triangle {

	private int base;
	private int height;
	private String type;
	private double area;

	public Triangle(int base, int height, int type) {
		this.base = base;
		this.height = height;
		
		switch (type) {
		case 1:  
			this.type = "Equilátero";
			
		break;
		case 2:  
			this.type = "Isósceles";
			
		break;
		case 3:  
			this.type = "Escaleno";
			
		break;
		
		}
		
		calcArea();
	}
	
	public void calcArea() {
		area = (base * height)/2;
	}

	public String getType() {
		return type;
	}
	
	public double getArea() {
		return area;
	}
	
}
