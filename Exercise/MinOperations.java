import java.util.*;
import java.io.*;

class MinOperations {

	public static int MinOps(int i,int j, int k){

		int oddCount=0;
		if(i%2!=0) { oddCount++;};
		if(j%2!=0) { oddCount++;};
		if(k%2!=0) { oddCount++;};

		if(oddCount==1 || oddCount==2){
			return -1;
		}
			int cnt=0;
			while(!(i==j && j==k)){
	             int[] arr={i,j,k};
	             Arrays.sort(arr);
	             arr[0]++;
	             arr[1]++;
	             arr[2]--;

	             i=arr[0];
	             j=arr[1];
	             k=arr[2];

	             cnt++;
			}
			return cnt;

   }

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();

		System.out.println(MinOps(i,j,k));

	}
}