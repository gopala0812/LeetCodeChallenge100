package Minimum_Average_of_Smallest_and_Largest_Elements_3194;

import java.util.*;

class MinimumAverage {

    public double minimumAverage(int[] nums) {
        double[] avg = new double[nums.length / 2];
        int min, max;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length / 2; i++) {
            min = nums[i];
            max = nums[nums.length - 1 - i];
            avg[i] = (double)(min + max) / 2;
        }

        double m = 100.0;
        for(int i = 0; i < avg.length; i++) {
            if(avg[i] < m) {
                m = avg[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        MinimumAverage obj = new MinimumAverage();
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(obj.minimumAverage(nums));
    }
}
