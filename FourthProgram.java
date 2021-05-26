import java.util.Scanner;

class FourthProgram {
	public static void main(String args[]){
		System.out.println("Enter a value (between 1 and 5 )  ");
		int b=new Scanner(System.in).nextInt();
		if(b>4 && b<6){
			System.out.println("FIVE");
		}
		else if(b>3){
			System.out.println("FOUR");
		}
		else if(b>2){
			System.out.println("THREE");
		}
		else if(b>1){
			System.out.println("TWO");
		}
		else if(b>0){
			System.out.println("ONE");
		}
		else{
			System.out.println("Invalid");
		}
	}
}