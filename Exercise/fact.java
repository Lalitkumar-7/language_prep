class fact {
    
    static int  factorial(int n){
      
        if(n == 0 || n == 1){
         return 1;
             }
        else{
             return factorial( n-1) * n;
        }
        
    }
    
public static void main(String args[]){
    
        
        int n = 5;
        int k = factorial(n);
        System.out.println("the factorial of number "+n+" is "+k);
    }
}