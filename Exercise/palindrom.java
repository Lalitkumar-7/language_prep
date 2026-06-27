import java.util.*;
class palindrom {
     public static void checkpelindrom(String str){
      
          StringBuilder rev = new StringBuilder();  // reverse string using stringBuilder
          StringBuilder st = new StringBuilder();
          rev=rev.append(str);
          rev=rev.reverse();
          st=st.append(str);

          int a = rev.compareTo(st);    // return 0 if equals -
          if(a==0){
              System.out.println("its a palindrom String!");
          } else {
            System.out.println("its Not a palindrom String!");
          }
     }

    public static void main(String args[]){
        int num=55355;
        String str=Integer.toString(num);
        checkpelindrom(str);
    
    }
}