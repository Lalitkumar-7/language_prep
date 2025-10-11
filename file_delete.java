import java.io.File;


class file_delete {
    public static void main(String args[]){
     
            File f = new File("data.txt");

            if(f.delete()){
                        System.out.println("file deleted successfully !");
        } 
        else {  System.out.println("file not deleted !");   }

        
    }
}