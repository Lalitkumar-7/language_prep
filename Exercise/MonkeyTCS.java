import java.io.*;
import java.util.*;


class MonkeyTCS {

    public static int remain_monk(int n,int k,int j,int m,int p){
        

        double mb =Math.ceil(((double)m/k));
        double mp =Math.ceil(((double)p/j));

        double m_remains=Math.max(0,n-(mb+mp));
        return ((int)m_remains);
    }

	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int j=sc.nextInt();
    int m=sc.nextInt();
    int p=sc.nextInt();

    if (n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
        System.out.println("invalid input !");
            System.exit(0); 
    }
    
    
    System.out.println(remain_monk(n,k,j,m,p));


	
}
}