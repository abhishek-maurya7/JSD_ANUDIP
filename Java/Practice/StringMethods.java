public class StringMethods {
    public static void main(String[] args) {
        String name = "Anudip Foundation";
			
		System.out.println(name.toUpperCase()); //Converts to uppercase
		System.out.println(name.toLowerCase()); //Converts to lowerCase
		System.out.println(name); //original variable remains same. String cannot be modified 
		System.out.println(name.startsWith("Anu")); //returns boolean based on whether string starts with given param
		System.out.println(name.endsWith("nnno")); //returns boolean based on whether string ends with given param
		System.out.println(name.charAt(7)); //return the character of string at given index
		System.out.println(name.length()); //returns length of the string

		int num = 567;
		String ss = String.valueOf(num); //converts int to string
		System.out.println(ss + 333);        
    }
}
