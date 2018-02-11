package Basics;

public class ExceptionHandle {
    String name = "mounica";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
  		int a = 10/0;
      }catch(NullPointerException e){
    	  System.out.println("the exception is "+e);
      }catch(ArithmeticException e) {
    	  System.out.println("the exception is "+e);
    	  ExceptionHandle id = null;
          System.out.println("the id is "+id);    	  
      }catch(Exception e) {
    	  System.out.println("the exception is "+e);
      }finally {
    	  System.out.println("the end of the code");
      }

	}

}
