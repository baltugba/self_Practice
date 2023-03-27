package day20_practice;

public class palindromes {
    public static void main(String[] args) {

        String[] name={"anna", "level", "Java"};
        String newName="";
        int count =0;
        for (String each:name){
            for (int i = each.length()-1; i >=0 ; i--) {
                newName+=each.charAt(i);

            }
            if(newName.equals(each)){
                count++;
            }
            newName="";
        }
        System.out.println(count);

    }
}
/*

4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */