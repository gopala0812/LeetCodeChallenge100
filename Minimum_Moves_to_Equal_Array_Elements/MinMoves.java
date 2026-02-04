package Minimum_Moves_to_Equal_Array_Elements;

import java.util.*;

class MinMoves {

    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;

        for(int n : nums) {
            max = Math.max(max, n);
        }

        int moves = 0;

        for(int n : nums) {
            moves += (max - n);
        }

        return moves;
    }

    public static void main(String[] args) {
        MinMoves obj = new MinMoves();
        int[] nums = {1, 2, 3};
        System.out.println(obj.minMoves(nums)); // 3
    }
}
