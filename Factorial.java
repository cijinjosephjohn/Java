import java.util.Scanner;

class Factorial{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int c =scan.nextInt();
		System.out.println("Factorial of "+c+" = "+fact(c));
	}
	static int fact(int n){
		if(n==1)
			return 1;
		else
			return(n*fact(n-1));
	}
}