class decimalToOctal {
    public static void main(String args[]) {
        int a = 33;       // The decimal number to convert
        int oct = 0;      // This will store our final octal number
        int place = 1;    // Tracks the structural position (1, 10, 100, 1000)
        boolean flagg = true;

        while (flagg) {
            int remainder = a % 8;      // 1. 🔥 Changed to % 8 (Get octal digit)
            
            oct = oct + (remainder * place); // 2. Shift it into the correct position
            
            a = a / 8;                  // 3. 🔥 Changed to / 8 (Divide decimal down)
            place = place * 10;         // 4. Move our placement pointer to the left
            
            if (a == 0) {
                flagg = false;          // 5. Exit when the number is fully broken down
            }
        }
        
        System.out.println(oct); // For 33, this will correctly output 41!
    }
}


// Octa to decimal

// class octalToDecimal {
//     public static void main(String args[]) {
//         int a = 41;       // The octal number to convert
//         int dec = 0;      // This will store our final decimal number
//         int i = 0;        // Tracks the positional power (0, 1, 2, 3...)
//         boolean flagg = true;

//         while (flagg) {
//             int remainder = a % 10;     // 1. Isolate the last octal digit
            
//             // 2. Multiply the digit by 8 raised to the power of its position
//             dec = dec + (remainder * (int) Math.pow(8, i)); 
            
//             a = a / 10;                 // 3. Chop off the processed digit
//             i = i + 1;                  // 4. Increment our power factor
            
//             if (a == 0) {
//                 flagg = false;          // 5. Exit when the number is fully broken down
//             }
//         }
        
//         System.out.println(dec); // For 41, this will correctly output 33!
//     }
// }