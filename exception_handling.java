import java.io.*;
import java.util.*;

class exception_handling {
    public static void main(String args[]){
        try {
            int result = 12/0;
        }
        catch(ArithmeticException e){
            System.out.println("error has occured : "+e);
            e.printStackTrace();
        }
        finally{
            System.out.println("this will always run !");
             }
        }
        
    }
