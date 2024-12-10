package lab_6;

abstract class Shap{
	public abstract double  calculateArea();
	public abstract double  calculatePerimeter();
}

class Circle extends Shap{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double calculateArea() {
		return Math.PI*radius*radius;
	}
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
}

class Triangle extends Shap{
	double side1,side2,side3;
	Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
	}
	
	public double calculateArea() {
		double s;
		s=side1+side2+side3/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public double calculatePerimeter() {
		return side1+side2+side3;
	}
	
}

public class Abstract {

	public static void main(String[] args) {
		Shap obj1=new Circle(5);
		System.out.println("Area circle:"+obj1.calculateArea());
		System.out.println("perimeter circle:"+obj1.calculatePerimeter());
		
		Shap obj2=new Triangle(1,2,3);
		System.out.println("Area Trinagle:"+obj2.calculateArea());
		System.out.println("Area Trianle:"+obj2.calculatePerimeter());
		
		

	}

}
