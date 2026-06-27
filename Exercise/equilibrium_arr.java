import java.util.*;
class equilibrium_arr{
  public static void main(String args[]){
    int[] arr={1,2,3,4,3,3};

   
    for(int i=0;i<arr.length;i++){
         int L=0;
         int R=0;

        for(int j=0;j<i;j++){
              L=L+arr[j];
        }
       for (int k = i + 1; k < arr.length; k++) {
                R = R + arr[k];
       }
     if(L==R){
        System.out.println("element found:"+arr[i]);
     }
   

    }

  }
}