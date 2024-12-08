package lab_5;

 class Shap{
	
	public void draw() {
		System.out.println("shape is drawn");
	}
	public void erase() {
		System.out.println("shape is erased");	
	}
}
class circle extends Shap{
	public void draw() {
		System.out.println("circle is drawn");
	}
	public void erase() {
		System.out.println("cirle is erased");
	}
}

class triangle extends Shap{
	public void draw() {
		System.out.println("triangle is drawn");
	}
	public void erase() {
		System.out.println("triangle is erased");
	}
}

class square extends Shap{
	public void draw() {
		System.out.println("square is drawn");
	}
	public void erase() {
		System.out.println("square is erased");
	}
}

public class Main {
	
	public static void main(String[] args) {
		//Dynamic memory dispatch (poliymorphism) bcs we created objects for all class using single reprense 
		Shap obj=new Shap();
		Shap tri=new triangle();
		Shap sqr=new square();
		Shap cir=new circle();
		
		displayShap(tri);
		displayShap(sqr);
		displayShap(cir);
	}
		
		public static void displayShap(Shap object)
		{
			object.draw();
			object.erase();
		}
	
	
	

}
