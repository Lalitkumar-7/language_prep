import java.util.*;
class leapyear {
	public static  boolean leapCheck(int y){
		if(y%4==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){

		System.out.println("enter the year in 'yyyy' formate : ");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
     
    
     if(leapCheck(y)){
     					System.out.println("year is leap  ");

     } else     		System.out.println("year is Not leap");

	}
}