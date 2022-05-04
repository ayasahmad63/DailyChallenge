public class _2_SortArrayByParity {


    class Solution {
        public int[] sortArrayByParity(int[] nums) {

            int i=0;

            while(i<nums.length && nums[i]%2==0){
                i++;
            }
            int j=i+1;

            while(j<nums.length){
                if(nums[j]%2==0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                }
                j++;
            }
            return nums;
        }
    }






}
