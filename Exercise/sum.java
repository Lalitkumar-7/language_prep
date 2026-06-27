import java.util.*;
import java.io.*;

class sum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
        

		if(i>j || i<0 || j>10000){
			System.out.println("invalid input");
       }
    int sum=0;

       for(int k=i;k<=j;k++){
        sum=sum+k;
       }
       System.out.println(sum);
       	}
}