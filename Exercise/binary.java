class binary {
    public static void main(String args[]){
        int a =11111;
        int n=10;
        int dec=0;
        for(int i=0;i<n;i=i+1){
            
                int temp=a%10;
                if(temp==1){
                     dec+=(int)Math.pow(2,i);
                      }
                a = a / 10;
        
        }
        
           System.out.println(dec);

       
    }
}


// for Decimal to Binary : 
// class decimalToBinary {
//     public static void main(String args[]) {
//         int a = 11;      
//         int bin = 0;      // This will store our final binary number
//         int place = 1;    // Tracks the structural position (1, 10, 100, 1000)
//         boolean flagg = true;

//         while (flagg) {
//             int remainder = a % 2;      // 1. Get the binary digit (0 or 1)
            
//             bin = bin + (remainder * place); // 2. Shift it into the correct position
            
//             a = a / 2;                  // 3. Divide the decimal number down by 2
//             place = place * 10;         // 4. Move our placement pointer to the left
            
//             if (a == 0) {
//                 flagg = false;          // 5. Exit when the number is fully broken down
//             }
//         }
        
//         System.out.println(bin); // For 11, this will correctly output 1011!
//     }
// }