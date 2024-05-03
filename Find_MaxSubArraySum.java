public class Find_MaxSubArraySum {
  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int MaxSum = Integer.MIN_VALUE;
    int currSum = 0;
    for(int i=0;i<nums.length;i++){
      currSum += nums[i];
      if(currSum > MaxSum){
        MaxSum = currSum;
      }
      if(currSum < 0){
        currSum = 0;
      }
    }
    System.out.println("Maximum SubArraySum is: " + MaxSum);
  }
}
