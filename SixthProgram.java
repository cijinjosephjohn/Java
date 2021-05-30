public class SixthProgram{
	public static void main(String args[]){
		String[] a= {"Charles","Lydia","Charlotte","Kitty","Mary"};
		int[] b={32,41,30,40,37};
		int i=0;
		System.out.println("\n");
		while(i<5){
			if(b[i]>35){
				System.out.println("Name : "+a[i]+"   Mark : "+b[i]+" \n");
			}
			i++;
		}
	}
}
