package Basics;

public class ReverseofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String names[] = new String[3];
		names[0] = "mona";
		names[1] = "ramya";
		names[2] = "varu";
        int n = names.length;
        System.out.println("length of the string names is :"+n);
        System.out.println("brfore revering");
        for(int i=0; i<n;i++) {
        	System.out.println(names[i]);
        }
        
        System.out.println("After revering");
        
      for(int i=0; i<n/2; i++){
    	 
          String list = names[i];
    	  names[i] = names[n-1];
    	  names[n-1] = list;
    	   // System.out.println(names[i]);
       }
      for(int i=0; i<n;i++) {
      	System.out.println(names[i]);
      }
      */
		//enhanced for loop
	/*	int marks[] = {2, 3, 5, 7, 3};
		for(int n : marks) {
			System.out.println(n);
		} */
		
		//multi dimentionla arrays
		
		int alpha[][] = {{1,2},{3,4}};
		int n =alpha.length;
		System.out.println(n);

		 for(int i = 0; i < n; i++)
		   {
		      for(int j = 0; j < n; j++)
		      {
		         System.out.println( alpha[i][j]);
		      }

		   }
		
		
		
}
}
