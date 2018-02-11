package Basics;

public class ReverseString {

	public static void main(String[] args) {
		// Method 1 to reverse a string
       String name = "Mounica is my name";
       System.out.println("name before reversing is "+name);
       StringBuffer sb = new StringBuffer(name);
       StringBuffer reversename = sb.reverse();
	   System.out.println("name before reversing is "+reversename);

		// Method 2 to reverse a string
	   int strlen = name.length();
	   System.out.println("the size of the string name is "+strlen);
	   for(int i=0; i<strlen;i++) {
		   System.out.print(name.charAt(strlen-i-1));
	   }
	   
	   //Method 3 to reverse a string
        String reverse = name.reverseGivenStrUseChar("mounica");

    	   
    	   
       }
	}


