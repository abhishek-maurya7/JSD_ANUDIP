public class Rectangle {
	int length;
	int width;
	Rectangle(int a, int b) {
		this.length = a;
		this.width = b;
	}
	int calculateArea() {
		return length * width;
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 4);
		Rectangle r2 = new Rectangle(5, 9);
		
		int a1 = r1.calculateArea();
		int a2 = r2.calculateArea();
		
		if(a1 > a2) {
			System.out.println("Rectangle1 > Rectangle2");
		} else if(a2 > a1){
			System.out.println("Rectangle1 < Rectangle2");
		} else {
			System.out.println("They are equal");			
		}
	}
}
