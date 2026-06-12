package student;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Bhanu",
                "ECE",
                9876542689L
        );

        System.out.println("Before Update:");
        student.displayStudent();

        student.setCourse("Java Development");
        student.setId(102);

        System.out.println("\nAfter Update:");
        student.displayStudent();

        System.out.println("\nStudent Name: " + student.getName());
    }
}