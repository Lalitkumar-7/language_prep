import java.util.*;
class perfectNum_range{

    public static boolean checkPerfect(int cnt){
    int sum=0;
    for(int i=1;i<cnt;i++){
        if(cnt%i==0){
         sum+=i;
        }
    }
   
   return sum==cnt?true:false;


    }


    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    if(n<=1  || n>Math.pow(10,8)){
       return;
    }
    int[] nums=new int[n];
    int i=0;
    int cnt=1;
    boolean flagg=true;
    while(flagg){
        if(checkPerfect(cnt)){
            nums[i]=cnt;
            i=i+1;
           
        }
         cnt=cnt+1;
        if(i==n){
            flagg=false;
        }
    }
    for(int j=0;j<nums.length;j++){
        System.out.println(nums[j]);
    }
    
    }
}