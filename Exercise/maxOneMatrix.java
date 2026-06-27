import java.util.*;
import java.io.*;

class maxOneMatrix {
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();

		int mat[][]=new int[r][c];

		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				mat[i][j]=sc.nextInt();
			}
		}

	int maxcount=0;
	int row=0;

	for(int i=0;i<r;i++){
		int currCount=0;

			for(int j=0;j<c;j++){
			if(mat[i][j]==1){
				currCount=currCount+1;
			}
				
			}
			if(currCount>maxcount){
				maxcount=currCount;
				row=i;
			}
		}

		System.out.println(row+1);


	}
}