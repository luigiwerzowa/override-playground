package at.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ludwig Werzowa
 */
public class ChildB extends Parent {

    private List<String> childList;

    public ChildB() {
        super();
    }

    @Override
    protected void initialize() {
        super.initialize();
        childList = Arrays.asList("C1", "C2", "C3");
    }

    @Override
    protected void printAll() {
        super.printAll();
        childList.forEach(System.out::println);
    }
}
