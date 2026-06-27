class prime {
    public static String checkprime(int num){
        
        if(num<=1){
         return "NO";
        }
        
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
               return "NO";   
            }  
        }
        return "YES";
    } 

    public static void main(String args[]){
        int num=7;
        System.out.println(checkprime(num));
    }
}