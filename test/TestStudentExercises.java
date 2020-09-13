import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import studentLambda.Student;
import studentLambda.StudentExercises;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudentExercises {
    StudentExercises studEx = new StudentExercises();
    ArrayList<Student> students = new ArrayList<>();

    @BeforeEach
    public void init(){
        students.add(new Student("mark", 2015, true));
        students.add(new Student("deji", 2018, false));
        students.add(new Student("gail", 2010, false));
    }

    @Test
    public void testIsActive(){
        /* Var lidt i tvivl om hvordan denne opgave skulle forstås
        student har allerede en boolean der bestemmer om den er aktiv
        så der var tvivl om hvad der skulle vurderes */
        ArrayList<Student> students = new ArrayList<>();
        studEx.isActive(students);
    }

    @Test
    public void testPrint(){
        studEx.print(students);
    }

    @Test
    public void testYears(){
        //student 0 started in 2015 so 5 years should have passed by now
        assertEquals(5, studEx.yearsPassed(students.get(0)));
    }

    @Test
    public void testPrintActiveStudents(){
        studEx.printActive(students.stream());
    }

    @Test
    public void testAccumulatedYears() {
        int total = 0;
        for (Student s : students) {
            total += studEx.yearsPassed(s);
        }
        assertEquals(total, studEx.accumulatedYears(students.stream()));
    }

    @Test
    public void testStringList(){
        studEx.listOfStrings(students.stream()).stream().forEach(System.out::println);
    }
}
