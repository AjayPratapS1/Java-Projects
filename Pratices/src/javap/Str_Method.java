package javap;

public class Str_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 🔹 1. Basic Methods

//		str.length();
//
//		str.charAt(int index);
//
//		str.substring(int beginIndex);
//
//		str.substring(int beginIndex, int endIndex);
//
//		str.concat(String str);
		 
		// 🔹 2. Comparison Methods

//		str.equals(Object another);
//
//		str.equalsIgnoreCase(String another);
//
//		str.compareTo(String another);
//
//		str.compareToIgnoreCase(String str);
		 
		// 🔹 3. Searching Methods

//		str.indexOf(int ch);
//
//		str.indexOf(String str);
//
//		str.lastIndexOf(String str);
//
//		str.contains(CharSequence s);
//
//		str.startsWith(String prefix);
//
//		str.endsWith(String suffix);
		 
		// 🔹 4. Case Conversion

//		str.toLowerCase();
//
//		str.toUpperCase();
		 
		// 🔹 5. Trimming and Replacing

//		str.trim();
//
//		str.replace(char oldChar, char newChar);
//
//		str.replace(CharSequence target, CharSequence replacement);
//
//		str.replaceAll(String regex, String replacement);
//
//		str.replaceFirst(String regex, String replacement);
		 
		// 🔹 6. Conversion

//		str.toCharArray();
//
//		String.valueOf(int value);  // static method
//
//		str.getBytes();
		 
		// 🔹 7. Split and Join

//		str.split(String regex);
//
//		str.split(String regex, int limit);
//
//		String.join(CharSequence delimiter, CharSequence... elements); // static method
		 
		// 🔹 8. Pattern Matching

//		str.matches(String regex);
		 
		// 🔹 9. Interning and Emptiness

//		str.intern();
//
//		str.isEmpty();
//
//		str.isBlank(); // Java 11+

		 
		
		String name = "Ajay Pratap Singh";
		String fName = "Ajay ";
		String lName = "Singh";
		//give length
		System.out.println("Size of string : " + name.length());
		//give upper case
		System.out.println("Upper case of string : " + name.toUpperCase());
		//give lower case
		System.out.println("Lower case of string : " + name.toLowerCase());
		//give index of given character
		System.out.println("Check the first occ of string : " + name.indexOf("Singh"));
		//merge the char
		System.out.println("Concatenation of string : " + fName.concat(lName));
		//point out the index on which char is
		System.out.println("Character at : " + name.charAt(0));
		//give sub string
		System.out.println("Substring : " + name.substring(3));
		//give string on first and last index
		System.out.println("Substring : " + name.substring(3,10));
		//check equal or not
		System.out.println("Check Equal : ");
		if(name.equals(name)) {
			System.out.println("Name is same");
		}
		//check if string is present
		System.out.println("Check if contain : " + name.contains("Ajay"));
		//check if string is empty or not
		System.out.println("Check empty : ");
		if(!name.isEmpty()) {
			System.out.println("No, it is not empty");
		}
		//check string is blank or not
		System.out.println("Check blank : ");
		if(!name.isBlank()) {
			System.out.println("No, it is not Blank");
		}
		System.out.println("Equal ignore case : ");
		//check equal without depending on uppercase and lowercase
		if(name.equalsIgnoreCase(lName)) {
			System.out.println("No, it is equal");
		}
		else {
			System.out.println("No, it is not equal");
		}
		//tells the name start with or not
		System.out.println("Start with string : " + name.startsWith(fName));
		//tells the lname end with or not
		System.out.println("end with string : " + name.endsWith(lName));
		//tells the last index value
		System.out.println("last index of string : " + name.lastIndexOf("j"));
		//trim method to remove space
		String newTrim = "    Hello   ";
		newTrim = newTrim.trim();
		System.out.println("Trim down the space : " + newTrim);
		//replace
		String r = "Ajay";
		r = r.replace("A", "");
		System.out.println("Replace Char : " + r);
		//replace all
		String r1 = "Ajay";
		r1 = r1.replaceAll("A", "Y");
		System.out.println("Replace Char : " + r1);

		
		
		
		
		
		

	}

}
