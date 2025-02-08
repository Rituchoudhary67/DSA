

public class SubArray {
  
   public static void subArrays(int arr[]) {
    int totalSubArray,subArrSum;
    totalSubArray = subArrSum =0;
    int minValue = Integer.MAX_VALUE;
    int maxValue = Integer.MIN_VALUE;

    for(int i=0; i<arr.length;i++) {
      int start = i;
      subArrSum = 0;
      for(int j=i; j<arr.length;j++) {
        int end = j;
        minValue = Integer.MAX_VALUE;
        maxValue = Integer.MIN_VALUE;

        //sub array logic 
        for(int k=start ; k<=end; k++) {
          System.out.print(arr[k] + " ");

          //find total sum of all sub array
          subArrSum = subArrSum + arr[k];

          //finding min and max value
          if(minValue > arr[k]) {
            minValue = arr[k];
          }
          if(maxValue < arr[k]) {
            maxValue = arr[k];
          }
        }
        totalSubArray++;
        System.out.println();
      }
      System.out.println("Minimum value in sub array is : " + minValue);
      System.out.println("Maximum value in sub array is : " + maxValue);
      System.out.println("Sum of sub arrays are : " + subArrSum);
      System.out.println();
    }
    System.out.println("Sub arrays are : " + totalSubArray);
   }


       public static void main(String args[]) {
         int arr[] = {2,4,6,8,10};
         subArrays(arr);
       }
}