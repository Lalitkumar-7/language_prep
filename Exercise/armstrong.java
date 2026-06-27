class armstrong{
    // Method to check Armstrong number using iteration
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        return sum == originalNum;
    }
    public static void main (String args[]){
        int num=153;                             //Output: Yes (1³ + 5³ + 3³ = 1 + 125 + 27 = 153)
        if(isArmstrong(num)){
            System.out.println("its armstrong number");
        } else {
            System.out.println("its Not a armstrong number");

        }
    }
}