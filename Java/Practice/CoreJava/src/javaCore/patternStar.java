package javaCore;
public class patternStar {
    void star(int rows) {
        for(int i = 1; i<=rows; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        patternStar p = new patternStar();
        p.star(5);
    }
}
