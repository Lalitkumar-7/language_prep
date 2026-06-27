import java.util.*;
import java.lang.*;

class perfectNum{
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    if(n<=1  || n>Math.pow(10,8)){
       return;
    }
     int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
         sum+=i;
        }
    }
   
   System.out.println((sum==n?"its Perfect":"its Not perfect"));


    }
}