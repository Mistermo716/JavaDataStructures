package LinkedLists;

//Comparable to use the compareTo
public class LinkedList<T extends Comparable<T>> implements List<T> {
   private Node<T> root;
   private int sizeOfList;

   @Override
   public void insert(T data) {
      ++this.sizeOfList;
      if(root == null){
         this.root = new Node<>(data);
      }else{
         insertDataAtBeginning(data);
      }
   }

   //O(1) time complexity
   private void insertDataAtBeginning(T data) {
      Node<T> newNode = new Node<>(data);
      newNode.setNextNode(root);
      this.root = newNode;
   }

   //O(N) complexity
   public void insertDataAtEnd(T data, Node<T> node){
      if(node.getNextNode() != null){
         //recursive call to the function
         //continue traversing list till getNextNode is null
         insertDataAtEnd(data, node.getNextNode());
      } else{
         Node<T> newNode = new Node<>(data);
         node.setNextNode(newNode);
      }

   }

   //O(N) complexity
   @Override
   public void remove(T data) {

      if(this.root == null){return;}

      --this.sizeOfList;

      if(this.root.getData().compareTo(data) == 0){
         this.root = this.root.getNextNode();
      } else{
         remove(data, root, root.getNextNode());
      }

   }

   private void remove(T dataToRemove, Node previousNode, Node<T> currNode){
      //while the current node is not null keep looping
      while(currNode != null){
         //if the node contains the data we want to remove
         //set previousNode to currNode next node
         if(currNode.getData().compareTo(dataToRemove) == 0){
            previousNode.setNextNode(currNode.getNextNode());
            currNode = null;
            return;
         }

         //if we cant find it move previousNode to currNode
         previousNode = currNode;
         //currNode to next node;
         currNode = currNode.getNextNode();
      }
   }

   @Override
   public void traverseList() {
      if(this.root == null){
         return;
      }

      Node<T> currNode = this.root;

      while(currNode != null){
         //we can do this since toString was overwritten
         System.out.print(currNode + " ");
         currNode = currNode.getNextNode();
      }
   }

   @Override
   public int size() {
      return this.sizeOfList;
   }
}
