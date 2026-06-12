package student;

public class Student {

    private int id;
    private String name;
    private String course;
    private Long number;

    Student(int id, String name, String course, Long number) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.number = number;
    }
    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public Long getNumber(){
        return number;
    }
    public void setNumber(Long number){
        this.number=number;
    }

    
    public String displayStudent(){
        return "Student id :"+id + "\nName:" +name + "\nCourse: " + course + "\nNumber: " + number;
    }
    
public static void main(String[] args) {

    Student objStudent = new Student(101, "bhanu", "ece", 9876542689L);

    System.out.println(objStudent.displayStudent());
}
}
