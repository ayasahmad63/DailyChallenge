public class _3_SortedUnSortedArray {

//   Youtube Solution:-  https://www.youtube.com/watch?v=GvAtQOMr8CQ&t=1s


    class Solution {
        public int findUnsortedSubarray(int[] nums) {

            int left=-1;
            int max=nums[0];
            for(int i=0;i<nums.length;i++){
                if(max>nums[i]){
                    left=i;
                }else{
                    max=nums[i];
                }
            }
            int right=0;
            int min=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                if(min<nums[i]){
                    right=i;
                }else{
                    min=nums[i];
                }
            }

            return left-right+1;
        }
    }

}
