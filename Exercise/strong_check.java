import java.util.*;
class strong_check {
    
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
        int sum=0;
        int n =sc.nextInt();
        int temp=n;
        boolean flagg=true;

        while(flagg){
            int dig=temp%10;
            
            sum=sum+factorial(dig);
            temp=temp/10;
            if(temp==0){
                flagg=false;
            }
        }
                     System.out.println("sum"+sum);

        if(sum==n){
             System.out.println("the number is Strong");
        } else {  System.out.println("the number is Not  Strong");
}
 sc.close();       }
}