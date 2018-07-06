package Arrays;

public class Array {
   public static void main(String[] args) {
      int [] arr = new int[5];

      for(int i = 0; i < arr.length; i++){
         arr[i] = i;
      }

      //O(1) accessing algorithim complexity.
      int num = arr[4];


      //O(N) Linear search
      //depends on entire length of array.
      for(int i = 0; i < arr.length; i++){
         if(arr[i] == 4){
            System.out.println("Index of 4 found: " + i);
         }
      }
   }
}
