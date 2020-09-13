package studentLambda;


public class Student {
    String name;
    int yearStarted;
    boolean isActive;

    public Student(String name, int yearStarted, boolean isActive) {
        this.name = name;
        this.yearStarted = yearStarted;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", yearStarted=" + yearStarted +
                ", isActive=" + isActive +
                '}';
    }
}

