package day27_practice;

public class Dog {
    public static void main(String[] args) {
        Dog dog1 =  new Dog("German Shapperd","Big","black",'M');
        System.out.println(dog1);
        dog1.eat();
        dog1.bark();
        dog1.play();
        System.out.println("Dog has :" + numberOfLegs+" legs");
        System.out.println(Dog.isFriendly);

    }

    public String bread,size,color;
    public char gender;

     public static int numberOfLegs,numberOfEyes,numberOfWings;
     public static boolean isFriendly;

    public Dog(String bread, String size, String color, char gender) {
        this.bread = bread;
        this.size = size;
        this.color = color;
        this.gender = gender;
    }
    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
        isFriendly= true;
    }
    public void eat(){
        System.out.println(bread + "is eating bone");

    }
    public void drink(){
        System.out.println(bread + " is drinking fresh water");
    }
    public void sleep(){
        System.out.println(bread + " is sleeping his owners lap");
    }
    public void play(){
        System.out.println(bread + " is playing soccer with kids");
    }
    public void bark(){
        System.out.println(bread + " is barking at the squirrel");
    }

    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
/*
 Create a class called Dog
            Variables:
                breed, size, gender, age, color, numberOfLegs, numberOfEyes, numberOfWings, isFriendly

            Add a constructor to initialized all the fields

            Add a static block to initialize all the statics

            Methods:
                eat()
                drink()
                sleep()
                play()
                bark()
                toString()
 */