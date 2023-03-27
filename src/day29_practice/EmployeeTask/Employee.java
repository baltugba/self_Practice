package day29_practice.EmployeeTask;


public class Employee {

    private String name;
    private char gender;
    private int age;
    private String id;
    private String jobTitle;
    private double salary;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender!='M'&& gender !='F'){
            System.err.println("Gender must be 'M' OR 'F'");;
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        if(age <18 || age>65){
            System.err.println("Age must be between 18 and 65");
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }



    public void testing() {
        System.out.println(name + " is testing the project");
    }

        public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*

	1. Create a custom Class named Tester
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				testing()
				toString(): prints tester object info when the object is passed in the print statement
 */