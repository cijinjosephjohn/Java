import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

class Shape extends JPanel{
	JFrame MainFrame = new JFrame();
	void comment_1(){
		System.out.println("Processing.......");
	}
	void comment_2(){
		System.out.println("Deleting......");
	}
}
class circle extends Shape{
	public void paint (Graphics g){
		setSize(500,500);
		g.drawOval(100,100,50,50);
	}
	void draw_circle(){
		MainFrame.setSize(600,600);
		MainFrame.add(this);
		MainFrame.setVisible(true);
		MainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	void erase_circle(){
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}
class triangle extends Shape{
	public void paintComponent(Graphics g) {
        	int [] x = {50,100,0};
        	int [] y = {0,100,100};
        	g.drawPolygon(x, y, 3);
    	}
	void draw_triangle(){
		MainFrame.setSize(600,600);
		MainFrame.add(this);
		MainFrame.setVisible(true);
		MainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	void erase_triangle(){
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class square extends Shape{
	public void paint(Graphics g){
		super.paint(g);
 		g.drawRect(50,50,100,100);
	}
	void draw_square(){
		MainFrame.setSize(600,600);
		MainFrame.add(this);
		MainFrame.setVisible(true);
		MainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	void erase_square(){
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}	
	
public class Inheritance {
	public static void main(String arg[]){
		circle obj1=new circle();
		triangle obj2 = new triangle();
		square obj3 = new square();
		obj1.comment_1();
		obj1.draw_circle();
		obj1.comment_2();
		obj1.erase_circle();
		obj2.comment_1();
		obj2.draw_triangle();
		obj2.comment_2();
		obj2.erase_triangle();
		obj3.comment_1();
		obj3.draw_square();
		obj3.comment_2();
		obj3.erase_square();	
	}
}