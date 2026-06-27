class sumdigit {
    public static int calc(int num){
          int sum=0;

          while(num !=0){
             sum+=num%10;
             num /=10;     // num = num/10
        }
        return sum;
    }  

    public static void main(String args[]){
        int num=555;

        System.out.println(calc(num));

    }
}