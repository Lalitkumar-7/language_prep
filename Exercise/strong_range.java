import java.util.*;
class strong_range {
    
    static int  factorial(int n){
      
        if(n == 0 || n == 1){
         return 1;
             }
        else{
             return factorial( n-1) * n;
        }
        
    }

    static boolean strong_checker(int n){
         int temp=n;
         int sum=0;
         boolean flagg=true;

         while(flagg){
            int dig=temp%10;
            
            sum=sum+factorial(dig);
            temp=temp/10;
            if(temp==0){
                flagg=false;
            }
        }
           if(sum==n){
             return true;
           } else {  return false;
}

    }
    


public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        
        int n =sc.nextInt();
        int cnt=1;
        int i=0;

		while(cnt<=n){
          if(strong_checker(i)){
          	cnt++;
          	System.out.println(i+" ");
          }
          i++;
		}

 sc.close();       }
}