class dectobinary {
    
        static void dectobin(int n){
          int bin[]= new int[1000];
          int i=0;

          while(n>0) {
           bin[i]=n%2;
           n=n/2;
           i++;
                     }

                     // print result
                     for(int j=i-1;j>=0;j--){
                        System.out.print(bin[j]);
                     }
        }
       
        public static void main(String args[]){
            int n=8;
            System.out.println("decimal number : "+n);
            
            System.out.print("binary number : ");
            dectobin(n);
        }
    
}