package day31_practice.Person;

public class CydeoStudent extends Student{

    private String programmingLanguage;
    private int batchNumber,groupNumber;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage== null || programmingLanguage.isEmpty()){
            System.err.println("Programming language can not be null or empy");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <=0){
            System.err.println("Batch number can not be zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if(groupNumber <= 0){
            System.err.println("Group number can not be zero or negative");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating lahmacun");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking tea while studying "+programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" couldnt sleep because of " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included
 */