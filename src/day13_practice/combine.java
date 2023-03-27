package day13_practice;

public class combine {
    public static void main(String[] args) {
        String str1="one";
        String str2="eight";
        System.out.println(combine(str1,str2));

    }

public static String combine(String str1,String str2){
        String result="";
        if(str1.substring(str1.length()-1).toLowerCase().equals(str2.substring(0,1).toLowerCase())){
            result = str1 + str2.substring(1);
        }else{
            result = str1+str2;
        }
        return result;
}






    /*
     Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
     */

}
