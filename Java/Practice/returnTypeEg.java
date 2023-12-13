class returnTypeEg {
    String greet(String name) {
        return "Hello " + name;
    }

    int addAll(int num) {
        int addition = 0;
        for(int i = 1; i<=num; i++) {
            addition += i;
        }
        return addition;
    }

    
    public static void main(String args[]) {
        returnTypeEg r = new returnTypeEg();
        System.out.println(r.greet("Abhishek"));
        System.out.println("Addition :" + r.addAll(5));
    }
}