package day33_practice.shapeTask;

public abstract class Shape { //parent class  //abstract class
    // Creating class as an abstract in order to be able to declare abstract methods with no implementation
    // All the variables and methods will be inherited by the Sub / Child / Concrete classes

    private String name;
    //constructor

    public Shape(String name) {
        setName(name);
    }

    //Getters and setter in case we will need to change the name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //abstract method with no implement
    public abstract double area();

    public abstract double perimeter();

    public abstract void draw();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                '}';
    }
}