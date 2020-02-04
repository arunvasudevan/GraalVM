/**
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of 
money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
             Total amount you can rob = 2 + 9 + 1 = 12.
*/
import java.util.Arrays;

class HouseRobber {
	public static void main(String[] args) {
		HouseRobber houseRobber = new HouseRobber();
		int[] input = {1,2,3,1};
		System.out.println("Input: "+Arrays.toString(input));
		int result = houseRobber.rob(input);
		System.out.println("Output: "+result);
	}
    public int rob(int[] nums) {
        int arrayLength = nums.length;
		
        if(arrayLength == 0) {
            return 0;
        }
        else if(arrayLength == 1) {
            return nums[0];
        }
        
        int[] maxValue = new int[arrayLength];
        
        maxValue[0] = nums[0];
        maxValue[1] = nums[0] > nums[1] ? nums[0]: nums[1];
        
        for(int i=2; i< nums.length; i++){
            maxValue[i] = Math.max(maxValue[i-2] + nums[i], maxValue[i-1]);
        }
        
        return maxValue[arrayLength-1];
    }
}