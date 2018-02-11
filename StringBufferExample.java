package Basics;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = "mounica";
		StringBuffer sb = new StringBuffer("mounica");
	    System.out.println(sb.length());
	    sb.append(" is a good girl");
	    System.out.println(sb);
	    System.out.println(sb.length());
	    System.out.println(sb.charAt(18));
	    System.out.println(sb.capacity());
	    System.out.println(sb.hashCode());
	    System.out.println(sb.equals("mounica"));
	    System.out.println(sb.delete(2, 5));
	    System.out.println(sb.chars());
	    System.out.println(sb.insert(6, 'z'));
	    System.out.println(sb.replace(0, 4, "baby"));
	    System.out.println(sb.reverse());
	    System.out.println(sb.substring(11, 18));
	    System.out.println();
	}

}
