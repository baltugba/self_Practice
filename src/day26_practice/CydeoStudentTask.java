package day26_practice;

public class CydeoStudentTask {
    public String name,id;
    public int age,grade,batchNumber,groupNumber;
    public char gender;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";

    public CydeoStudentTask(String name, String id, int age, int grade, int batchNumber, int groupNumber, char gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
    }
    public void study(){//instance
        System.out.println(name+ " is studying Java");
    }
    public void attendClass(){
        System.out.println(name+ " is attending Cydeo developer classes");
    }
    public static void printSchoolName(){// static
        System.out.println("School name is: "+ schoolName);
    }
    public static void printProgLanguage(){
        System.out.println("Programming language is Java");
    }
    public static void magicWord(){
        System.out.println("Wooden Spoon");
    }


    public String toString() {
        return "CydeoStudentTask{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                '}';
    }
}
/*
1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */