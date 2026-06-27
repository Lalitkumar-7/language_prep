import java.util.*;
class GreaterThanNby2  {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    Arrays.sort(arr);
   // The candidate must be at the middle index if it exists
        int candidate = arr[n / 2];
        
        // Verify if it actually appears more than n/2 times
        int count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        
        if (count > n / 2) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("-1");
        }
    
    }
}