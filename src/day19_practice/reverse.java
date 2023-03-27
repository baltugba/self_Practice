package day19_practice;

public class reverse {
    public static void main(String[] args) {
        String[]names={"Dilvin","Ilknur","Hilal","Mahmut","Ayse","Sefika","Hannah","Pinar","Feyza","Emre"};

        for (int i = 0; i < names.length; i++) {
            String reverse="";
            for (int j = names[i].length()-1; j >=0 ; j--) {
                char each=names[i].charAt(j);
                reverse+=""+each;

            }
            System.out.println(reverse);
        }

    }
}
/*
create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */