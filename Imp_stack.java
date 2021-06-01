import java.util.Scanner;

class Stack {
	int s[];
	int top;
	
	Stack (){
		s= new int[10];
		top=-1;
	}
	void push(int x){
		if (top==9){
			System.out.println("Stack overflow\n");
		}
		else{
			s[++top]=x;
			System.out.println("Inserted "+x);
		}
	}
	void pop(){
		if(top==-1){
			System.out.println("Underflow\n");
		}
		else{
			System.out.println("Remvoed "+s[top]);
			top--;
		}
	}
	void peek(){
		if(top==-1){
			System.out.println("Underflow\n");
		}
		else{
			System.out.println("Top Element : "+s[top]);
		}
	}
	void display(){
		if(top==-1){
			System.out.println("Underflow\n");
		}
		else{
			System.out.println("\nStack");
			for(int i=top;i>=0;i--){
				System.out.println(s[i]);
			}
		}
	}
}			
public class Imp_stack {
	public static void main(String args[]){
		int b=0;
		Stack obj = new Stack();
		while(b>=0){
			System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\n\nSelect your Choice : ");
			b=new Scanner(System.in).nextInt();
			
			if(b==1){
				int n;
				System.out.println("Enter the element :");
				n=new Scanner(System.in).nextInt();	
				obj.push(n);
			}
			else if(b==2){
				obj.pop();
			}
			else if(b==3){
				obj.peek();
			}
			else if(b==4){
				obj.display();
			}
			else if(b==5){
				break;
			}
			else{
				System.out.println("INVALID SELECTION\n");
			}
		}
	}
}