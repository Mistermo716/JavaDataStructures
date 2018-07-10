package LinkedLists;

//T is used for dynamic data assignents

public class Node<T extends Comparable<T>> {
   private T data;
   private Node<T> nextNode;

   Node(T data){
      this.data = data;
   }

   public T getData() {
      return data;
   }

   public void setData(T data) {
      this.data = data;
   }

   public Node<T> getNextNode() {
      return nextNode;
   }

   public void setNextNode(Node<T> nextNode) {
      this.nextNode = nextNode;
   }

   //override to string method and convert the data to string
   public String toString(){
      return this.data.toString();
   }

}
