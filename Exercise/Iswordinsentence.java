import java.util.*;
class Iswordinsentence {

    public static void wordpresent(String word){
        String sen = "hello world , my name is lalit";
        
        if(sen.contains(word)){
            System.out.println("word is present.");
        }
        else {
            System.out.println("word is Not present.");

        }
    }
    public static void main(String args[]){
        String word = "lalit";
        wordpresent(word);

    }
}