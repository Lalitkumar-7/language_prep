import java.io.*;

class file_create{                                             ////// create a file
    public static void main(String args[]){
     
     try{
        File f1 = new File("data.txt");
         if(f1.createNewFile()){
            System.out.println("file created successfully :"+f1.getName());
        } else {
            System.out.println("file already exist !!!");
        }
    }

    catch(IOException e){
        System.out.println("ERROR HAS OCCURED ");
        e.printStackTrace();
    }

}}