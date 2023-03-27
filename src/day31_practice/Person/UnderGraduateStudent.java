package day31_practice.Person;

public class UnderGraduateStudent extends Student{
    public UnderGraduateStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        super.study();
    }
}
