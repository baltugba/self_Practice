package day27_practice;

public class CydeoStudent {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent("Tugba","B28","Outer",'F',39);
        System.out.println(student1);

        student1.attendClass();
        student1.study();
        student1.printSchoolName();
        CydeoStudent.printSchoolName();
        CydeoStudent.printSecretCode();
        System.out.println(student1.name);

    }

    public String name,batchNumber,groupNumber;
    public char gender;
    public int age;

    public static String schoolName,fieldOfStudy,programmingLanguage,secretCode;

    public CydeoStudent(String name, String batchNumber, String groupNumber, char gender, int age) {
        this.name = name;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.age = age;
    }
    static{
        schoolName = "Cydeo School";
        fieldOfStudy = "Software tester";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printSecretCode(){
        System.out.println(secretCode);
    }
    public void attendClass(){
        System.out.println(name +" is attending the class" );
    }
    public void study(){
        System.out.println(name + " is studing Java");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*

2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */