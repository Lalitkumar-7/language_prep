import java.util.*;
class CountVowel {
     public static int vowelcounter(String str){
        if (str == null || str.isEmpty()) {
        return 0;
    }
    
         int cnt=0;
         char[] vowels = {'a','i','e','o','u'};
         char[] chars =str.toCharArray();

         for(int i=0;i<chars.length;i++){
            for(int j=0;j<vowels.length;j++){
               if(chars[i]==vowels[j]){
                cnt=cnt+1;
               }
            }
        }
        return cnt;
       
      }

    public static void main(String args[]){
        String str="Helloo";
        str=str.toLowerCase();
                 
        System.out.println("Number of vowels in the String : "+vowelcounter(str));

         
    }
}