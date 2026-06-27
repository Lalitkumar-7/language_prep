import java.util.*;
class numtoword {

    public static String converter(int num){
        String[] words={"zero","one","two","three","four","five","six","seven","eight","nine"};
         return words[num];
    }

    public static void main(String args[]){

       // numtoword obj =new numtoword();
        int num=1;

        if(num<0 || num>9){
            System.out.println("invalid input :) ");
        } 
        else{  System.out.println("the word for "+num+" is : "+converter(num));  }

    }
}