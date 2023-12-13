package Anudip;

public class publicAccessModifier {
	public String courseName = "Java Full Stack";
	public static void main(String[] args) {
		publicAccessModifier p = new publicAccessModifier();
		System.out.println(p.courseName);
	}

}
