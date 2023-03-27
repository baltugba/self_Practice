package day26_practice;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("Tugba",39,'F');
        Person p2 = new Person("Tayfun",45,'M');

        p1.eat("manti");
        p2.drink("Turkish Tea");
        p1.sleep();

        System.out.println(Person.hasNose);
        System.out.println(Person.hasWings);
        System.out.println(Person.numberOfEyes);

        System.out.println(p1);
        System.out.println(p2);

    }

    public String name;
    public int age;
    public char gender;
    public static boolean isHuman=true;
    public static boolean hasNose=true;
    public static boolean hasWings = false;
    public static int numberOfHead=1;
    public static int numberOfEyes=2;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;



    }
    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }
    public void sleep(){
        System.out.println(name + " is sleeping");

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
 Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */