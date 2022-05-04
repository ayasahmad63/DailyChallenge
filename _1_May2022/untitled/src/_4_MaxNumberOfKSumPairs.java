import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _4_MaxNumberOfKSumPairs {


//  Solution :-https://leetcode.com/problems/max-number-of-k-sum-pairs/discuss/2005922/Going-from-O(N2)-greater-O(NlogN)-greater-O(N)-%2B-MEME


//    This is the Important Question in which we going to carry out.





//    For This We are going to be three solution



//    1) First One Brute Force Method

//         Time Complexity:- O(n2)
//         Space Complexity:- O(1)

    class Solution {
        public int maxOperations(int[] nums, int k) {
            int ans=0;

            for(int i=0;i<nums.length;i++){
                if(nums[i]!=-1){
                    for(int j=i+1;j<nums.length;j++){


                        if(nums[j]!=-1 && nums[i]+nums[j]==k){
                            ans++;
                            nums[j]=-1;
                            break;
                        }


                    }
                    nums[i]=-1;
                }
            }
            return ans;
        }
    }







//    2) Some Better Solution

//         Time Complexity:- O(nlogn)+O(n)==O(nlogn)
//           Space Complexity:-O(1)

//   In this we sort the array then apply two pointers method



    class Solution {
        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int ans=0;
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int sum=nums[i]+nums[j];
                if(sum==k){
                    ans++;
                    i++;
                    j--;
                }else if(sum>k){
                    j--;
                }else{
                    i++;
                }



            }


            return ans;
        }
    }







//3)  Concise Method :- Using HashMap

//      Time Complexity:- O(n)
//      Space Complexity:- O(n)





    class Solution {
        public int maxOperations(int[] nums, int k) {

            Map<Integer,Integer> has=new HashMap<>();
            int ans=0;
            int i=0;
            while(i<nums.length){

                int sum=k-nums[i];
                if(has.containsKey(sum)){
                    ans++;
                    if(has.get(sum)==1){
                        has.remove(sum);
                    }else{
                        has.put(sum,has.get(sum)-1);
                    }

                }else{
                    has.put(nums[i],has.getOrDefault(nums[i], 0) + 1);
                }



                i++;

            }



            return ans;
        }
    }











}



