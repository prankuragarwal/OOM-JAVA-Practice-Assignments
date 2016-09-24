package assignment5_2b;

public class Rectangle extends Shape {
	
	private double l, b;
	
	public double CalculateArea(double l, double b) {
		GetData(l, b);
		return area();
	}
	
	public double area() {
		return l * b;
	}

	public void GetData(double l, double b){
		this.l = l;
		this.b = b;
	}
	
}
