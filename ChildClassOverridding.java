package Basics;

public class ChildClassOverridding extends ParentClassOverridding{

	
	void print() {
		System.out.println("This is my print method in child class");
	}
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ParentClassOverridding pc =  new ParentClassOverridding();
        ChildClassOverridding cc = new ChildClassOverridding();
        pc.print();
        cc.print();
	}
	

}
