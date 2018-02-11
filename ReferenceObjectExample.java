package Basics;

public class ReferenceObjectExample {
         
	static String name = "Mounica";
	static int id = 23;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one way of using refernce variablt to access variable and methods
	/*	ReferenceObjectExample s = new ReferenceObjectExample();
		s.StudentDetails(); */
		//2nd way using reference object to access variables and methods
		ReferenceObjectExample s = new ReferenceObjectExample();
		StudentDetails(s);
	}
	static void StudentDetails(ReferenceObjectExample a) {
		System.out.println("the student name is :"+name);
		System.out.println("the student id is :"+id);
	}
	
}
