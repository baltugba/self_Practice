package day19_practice;

public class classMates {
    public static void main(String[] args) {
        String[]myClassMates={"Tugba Bal","Hilal Ozkan","Dilvin Melek","Ozge Bektay","Defne Bal","Emre Bal","Tayfun Cool","Chuck Noris","MelGibson","Bruce Willis"};

        String result="";
        for (int i = 0; i < myClassMates.length; i++) {
            result= myClassMates[i].charAt(0)+"."+ myClassMates[i].charAt(myClassMates[i].indexOf(" ")+1)+".";
            System.out.println(result.toUpperCase());




        }
    }

}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */