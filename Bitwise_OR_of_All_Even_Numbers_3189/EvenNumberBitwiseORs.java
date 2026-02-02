package Bitwise_OR_of_All_Even_Numbers_3189;

import java.util.*;

class EvenNumberBitwiseORs {

    public int evenNumberBitwiseORs(int[] nums) {
        int r = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                r = r | nums[i];
            }
        }
        return r;
    }

    public static void main(String[] args) {
        EvenNumberBitwiseORs obj = new EvenNumberBitwiseORs();
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(obj.evenNumberBitwiseORs(nums)); // 6
    }
}
