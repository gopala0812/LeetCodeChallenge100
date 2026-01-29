package Climbing_Stairs_70;

import java.util.*;

class ClimbStairs {

    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }

        int a = 1;
        int b = 2;

        for(int i = 3; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        ClimbStairs obj = new ClimbStairs();
        System.out.println(obj.climbStairs(2)); 
        System.out.println(obj.climbStairs(5)); 
    }
}
