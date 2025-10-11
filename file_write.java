import java.io.*;
import java.io.FileWriter;

class file_write{                                             ////// write to a file
    public static void main(String args[]){
     
     try{
        FileWriter fw = new FileWriter("data.txt");
        fw.write("this data is inserted to file !!");
        System.out.println("data write successfully .");

        fw.close();
    }

    catch(IOException e){
        System.out.println("ERROR HAS OCCURED ");
        e.printStackTrace();
    }

}}