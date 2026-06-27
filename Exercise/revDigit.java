class revDigit{
    public static int revdig(int num){
       int reverse=0;
       while(num>0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
        
       }
       return reverse;
    }


    public static void main(String args[]){
        int num=123;
        System.out.println(revdig(num));

    }
}