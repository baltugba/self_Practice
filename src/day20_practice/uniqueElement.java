package day20_practice;

public class uniqueElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,3,5,6,0,0,7};
        String unique="";
        for (int each:arr){
            int count=0;
            for(int each1:arr){
                if(each==each1){
                    count++;
                }
            }
            if(count==1){
                unique+=each + " ";
            }
        }
        System.out.println(unique);
    }
}
