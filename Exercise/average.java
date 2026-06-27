import java.util.*;
class average {

    public float avg(int[] arr){
      float sum=0;
      int n=arr.length;
      for(int i=0;i<n;i++){
        sum=sum+arr[i];

      }
      return sum/n;

    }


    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};

        average obj = new average();
        float k = obj.avg(arr);
        System.out.println("the average of numbers is : "+k);
    }
}