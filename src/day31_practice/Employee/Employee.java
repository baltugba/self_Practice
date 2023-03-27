package day31_practice.Employee;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;

    private double salary;

    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            System.err.println("Age can not smaller than 18");
            System.exit(1);
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary can not be negative");
        }
        this.salary = salary;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'|| gender=='F')){
            System.err.println("Gender must be set 'F' or 'M'");
        }
        this.gender = gender;
    }
    public void work(){
        System.out.println(name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +

                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
/*
   Variables:
                name, age, gender, id, jobTitle, salary, comapnyName

            Encapsulate all the fields
                condition:
                    1. Age can not be zero or negative
                    2. Age can not be less than 18
                    3. gender can only be set to 'M' or 'F'
                    4. salary can not be negative

            Add a constructor to set all the fields

            Methods:
                work(): prints name + " is working"
                toString()

 */