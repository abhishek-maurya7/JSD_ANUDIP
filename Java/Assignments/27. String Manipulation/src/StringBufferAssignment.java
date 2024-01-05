public class StringBufferAssignment {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is StringBuffer");
		

        //appending another string to original string
        sb.append(" - This is a sample program");
        System.out.println("After adding a new string: " + sb);

        //inserting another string into original string
        sb.insert(20, "Object");
        System.out.println("After inserting 'Object' at 21st position: " + sb);

        //replacing "Buffer" with "Builder"
        int indexOfBuffer = sb.indexOf("Buffer");
        sb.replace(indexOfBuffer, indexOfBuffer + "Buffer".length(), "Builder");
        System.out.println("After replacing 'Buffer' with 'Builder': " + sb);
        
        // Reverses the entire string and printing it.
        sb.reverse();
        System.out.println("Reversed String: " + sb);

	}

}
