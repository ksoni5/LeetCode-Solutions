package solutions;

class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int[] i = {33,4,1,66};
        int j = 5;
        twoSum( i, j );
    }

    public static int[] twoSum(int[] nums, int target) {
         for (int i = 0; i < nums.length; i++) {
             for (int j = i+1; j < nums.length; j++){
                 if(target == nums[i] + nums[j]){
                     return new int[] { i,j };
                 }
             }
             
        }
        throw new IllegalArgumentException("No possible solution with the given array");
    }
}
