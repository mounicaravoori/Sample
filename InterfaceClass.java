package Basics;

public class InterfaceClass implements Interface1, Interface2 {


	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("The product of c and d is"+ (c*d));
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("the sum of a and b is :"+(a+b));


	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		InterfaceClass c = new InterfaceClass();
         c.mul();
         c.sum();


	}

}
