package LinkedLists;

public class Main {
   public static void main(String[] args) {

      //Random access is not available in LinkedLists

      //when using T Generic data type cannot be primitive data type
      List<Integer> list = new LinkedList<Integer>();

      //inserting at the beginning of a linkedlist is O(1)
      //Just set new node pointer to LinkedList
      //Remember Arrays beginning insertions are O(N)

      list.insert(10);
      list.insert(-2);

      list.traverseList();

      //Inserting at the end of a linkedlist is O(N)
      //traverse until the end pointing to null
      //Remember Arrays end insertions are O(1)

      //Removing items in the beginning is O(1)

      //Removing at a given point is O(N)
      //must search for the node.

      //deletion much quicker using LinkedLists because you simply have
      //node point to next node.
      //Arrays you need to shift the indexes.

      //LinkedLists use alot of space.
   }
}
