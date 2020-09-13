package studentLambda;

import java.util.function.Consumer;

public class PrintConsumer implements Consumer<Student> {
    @Override
    public void accept(Student student) {
        System.out.println("----------------------");
        System.out.println("Name: " + student.name);
        System.out.println("Starting year: " + student.yearStarted);
        System.out.println("is Active: " + student.isActive);
        System.out.println("----------------------");
    }
}
