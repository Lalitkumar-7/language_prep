
import java.io.*;

class constructor1 {
   long x,y;

    constructor1(long a, long b){
        x=a;
        y=b;
        System.out.println(" sum is :"+(a+b));

    }
    

    public static void main(String args[]){
                            
     constructor1 obj = new constructor1(4,3);               // parameterized constructor called
     constructor1 obj2 = new constructor1(8934323,43423);
      
    }
}
