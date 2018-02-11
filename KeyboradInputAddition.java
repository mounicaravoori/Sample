package Basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboradInputAddition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         int a;
         int b;
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         System.out.println("Enter the values of a ");
         int a1 = Integer.parseInt(br.readLine());
         System.out.println("Enter the values of b ");
         int b1 = Integer.parseInt(br.readLine());
         System.out.println("the sum of a and b is:" + (a1+b1));
         
	}

}
