package ArrayList;
import java.util.ArrayList;

public class ArrayListMain {
   public static void main(String[] args) {
      //Equivalent to Vector but is quicker overall
      //ArrayLists are multi-threaded
      //While a vector is single threaded

      //Random access is O(1) add or get.
      //All other operations are O(N) for ArrayLists

      //You can add initial capacity.
      //ArrayLists are dynamic can size will change
      //What is powering them is fixed arrays
      //So going over initial capacity means copying
      //entire array into a new one with length + 1
      //so make this a large number so we avoid O(N) complexity
      //if no capacity is given it will constantly have to
      //copy all items in new array every addition.
      ArrayList<String> list = new ArrayList<>(5000);


      //add() is O(1)
      //adds to end of list

      list.add("Muaath");
      list.add("Sharifah");
      list.add("Hannah");
      list.add("Bilal");


      for(String s: list){
         System.out.println(s);
      }

      //get() is O(1)

      String wife = list.get(1);


      System.out.println("My Wife: " + wife);


      //remove() is O(N)
      //removes at index
      list.remove(3);

      //Methods

      //returns int size
      int size = list.size();
      System.out.println("Current array size: " + size);

      //returns boolean
      boolean emptyCheck = list.isEmpty();
      System.out.println("Empty: " + emptyCheck);

      //returns Array Object

      Object[] array = list.toArray();

      for(Object i : array){
         System.out.println("In Object Array: " + i);
      }

   }
}
