package day31_practice.Person;

public class TestPersonObject {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Lale",25,'F',"B11","Java","Cydeo School",'A',26,02,"Java");

        Student student = new Student("Gul",25,'F',"b13","IT","Cydeo School",'A');

        GraduateStudent graStudent = new GraduateStudent("Yasmin",22,'F',"B14","Art","Art Academy",'B');

        UnderGraduateStudent underGraStu = new UnderGraduateStudent("Nergiz",23,'F',"B16","Science","Science academy",'D');

        System.out.println(cydeoStudent);
        System.out.println(student);
        System.out.println(graStudent);
        System.out.println(underGraStu);

        student.eat();
        underGraStu.drink();
        graStudent.sleep();
        cydeoStudent.study();
        cydeoStudent.sleep();




    }
}
