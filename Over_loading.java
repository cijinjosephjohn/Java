
class Overloading {
	int Area(int l,int b){
		return l*b;
	}
	double Area(double r){
		double pi=3.142;
		return pi*r*r;
	}
	int Area(int a){
		return a*a;
	}
}
	
		
	
public class Over_loading {
	public static void main(String args[]){
		Overloading obj= new Overloading();
		int l=3,b=4,a=2;
		double r=2.0;
		int area1;
		area1 = obj.Area(l,b);
		double area2;
		area2 = obj.Area(r);
		int area3;
		area3 = obj.Area(a);
		System.out.println("Rectange with Length " + l + " Width " + b + "\nArea : "+ area1);
		System.out.println("Circle with radius " + r + "\nArea : " +area2);
		System.out.println("Square with side " + a + "\nArea : " + area3);
	}
}