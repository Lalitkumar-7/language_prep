class swap {
    public static void main(String args[]){
        int a =4;
        int b =9;

        // int temp = a;
        // a=b;
        // b=temp;
        

        a=a^b;        // without third variable
        b=a^b;
        a=a^b;

        System.out.println("a:"+a+"b:"+b);
    }
}