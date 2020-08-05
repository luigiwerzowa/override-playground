package at.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ludwig Werzowa
 */
public class Parent {

    protected List<String> parentList;

    public Parent() {
        initialize();
    }

    protected void initialize() {
        parentList = Arrays.asList("P1", "P2", "P3");
    }

    protected void printAll() {
        parentList.forEach(System.out::println);
    }
}
