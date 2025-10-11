import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException; 

class file_read {
    public static void main(String args[]){
        try{
            File f = new File("data.txt");
            Scanner sc = new Scanner(f);

            while(sc.hasNextLine()){
                String t =sc.nextLine();
                System.out.println("Data :"+t);

          }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("file not found !");
            e.printStackTrace();
        }

        
    }
}