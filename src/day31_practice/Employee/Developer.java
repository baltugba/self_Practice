package day31_practice.Employee;

public class Developer extends Employee {
    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary);

    }












    @Override
 //   public void work() {
//        System.out.println(getJobTitle()+getName()+" is coding in"+ programmingLanguage);
 //   }
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +

                ", age=" + getAge() +
                ", id=" +getId() +
                ", salary=" + getSalary() +
                ", gender=" + getGender()+

                '}';
    }
}
