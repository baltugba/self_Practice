package day31_practice.Person;



public class Student extends Person {

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
        this.grade = grade;
    }

    private String studentId,fieldOfStudy,schoolName;
    private char grade;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy==null || fieldOfStudy.isEmpty()){
            System.err.println("Field of study can not be set null or can not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }


    public void setGrade(char grade) {
        if(!(grade =='A'|| grade=='B'|| grade=='C'|| grade=='D'|| grade=='F') ){
            System.err.println("Grade must be valid");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if(schoolName==null || schoolName.isEmpty()){
            System.err.println("School name can not be null or empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(getName()+" is studying");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentId="+ studentId+
                ", fieldOfStudy=" + fieldOfStudy+
                ", schoolName=" + schoolName+
                ", grade="+ grade+
                '}';
    }

}
/*
Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included
 */