package day26_practice;

import day21_practice.CydeoStudents;

public class TestCydeoStudent {
    public static void main(String[] args) {
        CydeoStudentTask student1 = new CydeoStudentTask("Tugba","B26",39,1,1983,66,'F');

        student1.study();//Tugba is studying Java
        System.out.println(student1);

        student1.attendClass();
        System.out.println(student1);//Tugba is attending Cydeo developer classes

        CydeoStudentTask.printSchoolName();
        CydeoStudentTask.printProgLanguage();
        CydeoStudentTask.magicWord();



    }
}
