abstract class demo{
    public abstract void sound();
}

public class abstract_method extends demo{

   public void sound(){
    System.out.println("make sound !!");
}

 public static void main(String args[]){



        demo obj = new abstact_method();
        obj.sound();

       }
}