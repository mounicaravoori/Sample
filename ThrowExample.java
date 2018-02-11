package Basics;

public class ThrowExample {
     
	String name = "mona";
	public static void main(String args[]) {
		try {
	    	 int i=10/0;
	     }catch(ArithmeticException e) {
	    	 ThrowExample s = new ThrowExample();
	    	 System.out.println("the error is "+e);
	    	 
	    	try { 
	    		if(s.name.equals("mona")) 
	    		{
	    		 throw new StudentNotFound("the student with name mona doesn't exists");
	    	 }
	    	}catch(StudentNotFound e1) {
	    		System.out.println("the exception is "+e1);
	    	}

	     }finally {
	    	 System.out.println("end of block");
	     }

	}
	}
