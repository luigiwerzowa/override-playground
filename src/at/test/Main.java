package at.test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Printing parent..");
        new Parent().printAll();
        System.out.println("Printing child A..");
        new ChildA().printAll();
        System.out.println("Printing child B..");
        new ChildB().printAll();
    }
}
