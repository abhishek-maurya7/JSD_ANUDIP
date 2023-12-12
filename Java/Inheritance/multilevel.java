class gp {
    void grandparent() {
        System.out.println("I am grandparent");
    }
}

class father extends gp {
    void father() {
        System.out.println("I am father");
    }
}

class child extends father {
    void child() {
        System.out.println("I am the child");
    }
}

public class multilevel {
    public static void main(String[] args) {
        child childInstance = new child();

        childInstance.grandparent(); 
        childInstance.father();
        childInstance.child();
    }
}
