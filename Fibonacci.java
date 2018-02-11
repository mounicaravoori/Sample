package Basics;

public class Fibonacci {
    
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;

	

	static void fibseries() {

		System.out.println(n1);
		System.out.println(n2);
		n3 = n1+n2;
		n1=n2;
		n2=n3;

		System.out.println(n3);

		
		
		//fibseries();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibseries();
	}

}
