package Basics;

public class Recurssion {

	static int i = 0;
	static void increaseX() {

		System.out.println("the i value is :"+i);
		i++;
		if(i<300)
		increaseX();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseX();

	}
	

}
