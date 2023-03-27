package day17_practice;

public class testStudent {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setInfo("Tugba", 'F',20,"0611","12",false);

        Student student2 = new Student();
        student2.setInfo("Defne",'F',15,"E2320","12",true);

        System.out.println(student1);
        System.out.println(student2);
        student1.study();
    }
}
