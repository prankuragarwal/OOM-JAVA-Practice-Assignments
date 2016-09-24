package assignment5_2b;

public class Circle extends Shape {
	
	private double r;
	
	public double CalculateArea(double r) {
		GetData(r);
		return area();
	}
	
	public double area() {
		return Math.PI * r * r;
	}

	public void GetData(double r){
		this.r = r;
	}
	
}