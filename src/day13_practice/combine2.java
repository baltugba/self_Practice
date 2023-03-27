package day13_practice;

public class combine2 {
    public static void main(String[] args) {
        String n1="Defne";
        String n2= "Emre";
        System.out.println(combine(n1,n2));

    }

    public static String combine(String n1,String n2){
        String result="";
        if(n1.substring(n1.length()-1).toLowerCase().equals(n2.substring(0,1).toLowerCase())){
            result=n1 + n2.substring(1);
        }else{
            result=n1+n2;
        }
        return result;
    }


}
