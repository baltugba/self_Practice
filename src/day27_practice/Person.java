package day27_practice;

public class Person {
    public static void main(String[] args) {
        Person p1 = new Person("Defne","Turkish",15,'F');
        Person p2 = new Person("Emre","English",11,'M');

        System.out.println(p1);
        System.out.println(p2);
        p1.eat();
        p2.drink();
        System.out.println(p1.language);
        System.out.println(p2.name);
        System.out.println(Person.planet);
        System.out.println(Person.numberOfHead);
    }

    public String name,language;
    public int age;
    public char gender;

    public static String planet;
    public static boolean isHuman,hasNose;
    public static int numberOfWings,numberOfHead;

    public Person(String name, String language, int age, char gender) {
        this.name = name;
        this.language = language;
        this.age = age;
        this.gender = gender;
    }
    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }
    public static void printPlanetName(){
        System.out.println("Our planet name is: " + planet);
    }
    public void eat(){
        System.out.println(name + " is eating Kebap");
    }
    public void drink(){
        System.out.println(name + " is drinking Salgam");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*

4. Create a class named Person:
            Variables:
                name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            Methods:
                printPlanetName()
                eat(String food)
                drink(String drink)
                toString()

 */