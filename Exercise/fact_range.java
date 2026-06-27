import java.util.*;

class fact_range {
    
    static int  factorial(int n){
      
        if(n == 0 || n == 1){
         return 1;
             }
        else{
             return factorial( n-1) * n;
        }
        
    }
    
public static void main(String args[]){
  Scanner sc=new Scanner(System.in);    
        
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
        System.out.println(factorial(i));

        }
    }
}