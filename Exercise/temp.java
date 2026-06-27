import java.util.*;

class temp {
    
    public static boolean checkPalin(int n){

        String temp = String.valueOf(n);


        char[] s = temp.toCharArray();
        
        int cnt=0;
       for(int i=s.length-1;i>=0;i--){
        if(s[i]!=s[cnt]){
            return false;
           
        }
        cnt=cnt+1;
       }
        return true;
    }
    
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);    
        
        int n =sc.nextInt();
       
        if(checkPalin(n)){
            System.out.println("its Palindrom.");
        } else {System.out.println("its Not Palindrom.");}

        }
    }
