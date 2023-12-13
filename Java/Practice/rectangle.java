public class rectangle {
    int length;
    int width;
    rectangle(int a, int b) {
        length = a;
        width = b;
    }

    public int calculate() {
        return length * width;
    }

    public static void main(String[] args) {
        rectangle r1 = new rectangle(8, 5);
        rectangle r2 = new rectangle(5, 6);
        
        int a1 = r1.calculate();
        int a2 = r2.calculate();
        
        if(a1 > a2) {
            System.out.print("Rectangle1 > Rectangle2");
        } else if(a2 > a1) {
            System.out.print("Rectangle1 < Rectangle2");
        } else {
            System.out.print("They are equal");
        }
    }
} 
