package assignment5_2b;

public class Triangle extends Shape {
	
	private double a, b, c;
	
	public double CalculateArea(double a, double b, double c) {
		GetData(a, b, c);
		return area();
	}
	
	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public void GetData(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}
