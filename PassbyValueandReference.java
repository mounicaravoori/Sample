package Basics;

public class PassbyValueandReference {
	
	String name = "Mounica";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassbyValueandReference s = new PassbyValueandReference();
		printname(s);
		System.out.println(s.name);
		
		int id = 24;
		printid(id);
		System.out.println(id);
	}
	
	static void printname(PassbyValueandReference s) {
		s.name = "Radhika";
	}
	static void printid(int id) {
		id = 20;
	}

}
