package com.example.micronaut;

import java.util.List;

public class HouseRobber {

    public static int rob(List<Integer> nums) {
        int numsLength = nums.size();
        if (numsLength == 0) {
            return 0;
        } else if (numsLength == 1) {
            return nums.get(0);
        }

        int[] maxValue = new int[numsLength];

        maxValue[0] = nums.get(0);
        maxValue[1] = nums.get(0) > nums.get(1) ? nums.get(0) : nums.get(1);

        for (int i = 2; i < numsLength; i++) {
            maxValue[i] = Math.max(maxValue[i - 2] + nums.get(i), maxValue[i - 1]);
        }

        return maxValue[numsLength - 1];
    }
}
