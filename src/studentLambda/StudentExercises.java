package studentLambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentExercises {
    public void isActive(ArrayList<Student> students){
        Consumer<Student> isActiveConsumer = student -> {
            Predicate<Student> pred = s -> s.isActive == true;
            System.out.println("Student " + student.name + " is active: " + pred.test(student));
        };
        students.stream().forEach(isActiveConsumer);
    }
    public void print(ArrayList<Student> students){
        students.stream().forEach(new PrintConsumer());
    }
    public int yearsPassed(Student student){
        return LocalDate.now().minusYears(student.yearStarted).getYear();
    }
    public void printActive(Stream<Student> stream){
        Predicate<Student> pred = student -> student.isActive;
        stream.filter(pred).forEach(new PrintConsumer());
    }
    public int accumulatedYears(Stream<Student> stream){
        return stream.mapToInt(this::yearsPassed)
                .reduce(0,(total,elem) -> total + elem);
    }
    public ArrayList<String> listOfStrings(Stream<Student> stream){
        return stream.map(a -> a.toString()).collect(Collectors.toCollection(ArrayList::new));
    }
}
