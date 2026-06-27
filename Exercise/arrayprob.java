// Problem: Rearrange an array containing only 0s and 1s so that all 0s are on the left
// and all 1s are on the right.
class arrayprob {
     public static void main(String args[]){
        int[] arr={1,1,0,1,0,1,0,1,0,0};

        // Rearrange the array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Increment left index if the element is 0
            if (arr[left] == 0) {
                left++;
            } 
            // Decrement right index if the element is 1
            else if (arr[right] == 1) {
                right--;
            } 
            // Swap elements if left is 1 and right is 0
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}