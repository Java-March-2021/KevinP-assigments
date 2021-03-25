import java.util.ArrayList;
import java.util.Arrays;
public class ListOfExceptions{

      public static void main(String[] args) 
         
     {

ArrayList<Object> myList = new ArrayList<Object>();
myList.add("13");
myList.add("hello world");
myList.add(48);
myList.add("Goodbye World");



for(int i = 0; i < myList.size(); i++) {

    try{
    Integer castedValue = (Integer) myList.get(i);
    System.out.println("casted Value" + castedValue);
    }
    catch(Exception e){
        System.out.println("Check your values in the code");


    }

}


}}
