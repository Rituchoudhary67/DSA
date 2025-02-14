package Array;
// MAX-SUB ARRAY Sum by Kadane's Algorithm 

public class Main {

      public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++) {
          cs = cs + arr[i];
          if(cs < 0) {
            cs = 0;
          }
          ms = Math.max(cs,ms);
          //System.out.println(ms);
          // if all elements are negative numbers then find the smallest
          if(ms == 0) {
            if(smallest > arr[i]) {
              ms = arr[i];
            }
          }
        }
        System.out.println("Our max subarray sum is : " + ms);
      }

       public static void main(String args[]) {
         int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
       }
}