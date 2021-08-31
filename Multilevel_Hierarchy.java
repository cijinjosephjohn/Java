class Box{
	double width=0,height=0,depth=0;
	Box(double w,double h ,double d){
		width =w;
		height=h;
		depth=d;
	}
	double volume(){
		return width*height*depth;
	}
	
}
class BoxWeight extends Box{
	double weight=0;
	BoxWeight (double w,double h,double d,double we){
		super(w,h,d);
		weight = we;
	}

}
class Shipment extends BoxWeight{
	double cost=0;
	Shipment (double w,double h, double d,double we,double co){
		super(w,h,d,we);
		cost =co;
	}
	
}

class Multilevel_Hierarchy {
	public static void main(String args[]){
		Shipment box1=new Shipment(10,20,30,40,50);
		Shipment box2 = new Shipment(60,70,80,90,100);
		
		double vol1= box1.volume();
		System.out.println("First Shipment");
		System.out.println("Volume of shipment : "+vol1+"\nWeight of Shipment : "+box1.weight+"\nShipping cost : "+box1.cost);
		double vol2=box2.volume();
		System.out.println("Second Shipment");
		System.out.println("Volume of shipment : "+vol2+"\nWeight of Shipment : "+box2.weight+"\nShipping cost : "+box2.cost);
	}
}
		