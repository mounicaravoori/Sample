package Basics;

public class StringsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Fname = "Mounica";
		String Lname = "Ravoori";
		String Fname1 = "MOUNICA";
		String Lname1 = "";
        String name = "  My name is mounica";
		
		System.out.println(Fname +" "+ Lname);
		System.out.println(Fname.charAt(6));
		System.out.println(Fname.compareTo(Lname));
		System.out.println(Fname.concat(Lname));
		System.out.println(Fname.contains("cat"));
		System.out.println(Lname.endsWith("oori"));
		System.out.println(Fname.equals(Fname1)); //case sensitive
		System.out.println(Fname.equalsIgnoreCase(Fname1)); //just like '=' and is not case sensitive
		System.out.println(Lname1.isEmpty());
		System.out.println(String.join("-","My","name","is","mounica")	);
		System.out.println(Lname.lastIndexOf("c")); //as "c" is not present it returns -1
		System.out.println(Lname.length());
		System.out.println(name.replace("a", "z"));
		System.out.println(name.replaceAll("is", "was"));
		String words[] = name.split("\\s");
		for(int i = 0; i<words.length;i++) {
			System.out.println(words[i]);
		}
		System.out.println(name.startsWith("My"));
		System.out.println(name.substring(4, 10));
		System.out.println(name.toUpperCase());
		System.out.println(Fname1.toLowerCase());
		System.out.println(name.trim());
	}

	

}
