import java.util.*;
class maxInMatrix {
    public static void main(String args[]){

      int[][] mat= {{1,23,663},{663,4,5},{6,7,55}};
      int max=0;

      for(int i=0;i<mat.length;i++){
         for(int j=0;j<mat.length;j++){
            if(mat[i][j]>=max){
                max=mat[i][j];
            }
         }
      }     System.out.println(max);


    }
}