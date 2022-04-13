import java.util.ArrayList;
import java.util.Collections;
public class Q3AL {
   public static void main(String[] args) {
      ArrayList<String> aList = new ArrayList<String>();
      aList.add("Ashok");
      aList.add("Poo");
      aList.add("Josh");
      aList.add("Devs");
      aList.add("Sam");
      
      Collections.reverse(aList);
      System.out.println(aList);   
   }
}