package Basics;

public class ParentOverloading {

	void add(int a, int b) {
		System.out.println("the sum of a and b is "+ (a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("the sum of a, c and b is "+ (a+b+c));
	}
	
	String name(String name) {
		System.out.println("your name is ");
		return name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentOverloading po = new ParentOverloading();
		po.add(10, 20);
		po.add(10, 30, 40);
		System.out.println(po.name("saibaba"));
	}

}
