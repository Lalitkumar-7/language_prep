import java.util.*;
import java.io.*;

class count_sunday{
	public static void main(String args[]){

		Scanner sc=new Scanner(System.in);
        String day =sc.nextLine();
		int daysCount=sc.nextInt();

		Map<String,Integer> map=new HashMap<>();
		map.put("mon",6);
		map.put("tue",5);
		map.put("wed",4);
		map.put("thu",3);
		map.put("fri",2);
		map.put("sat",1);
		map.put("sun",0);

		int cnt=0;
		if(daysCount-map.get(day)>1){
			cnt= 1 + (daysCount-map.get(day)) / 7; 
		}
		System.out.println(cnt);
	}
}