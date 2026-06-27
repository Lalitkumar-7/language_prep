import java.util.*;
class Nprime {

	public static boolean checkPrime(int n){
			if(n<=1){
				return false;
			}
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
				 return false; };
				
			}  return true;
		}

	public static void main(String args[]){
		int n=10;
		int cnt=0;
        int i=2;

        int sum =0;

		while(cnt<n){
          if(checkPrime(i)){
          	cnt++;
          	System.out.println(i+" ");
          	sum=sum+i;
          }
          i++;
		}
		System.out.println("the sum of primes is : "+sum);

	}
}