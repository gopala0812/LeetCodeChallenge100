package Find_Smallest_Letter_Greater_Than_Target_744;

import java.util.*;

class NextGreatestLetter {

    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++) {
            if(letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    public static void main(String[] args) {
        NextGreatestLetter obj = new NextGreatestLetter();
        char[] letters = {'c','f','j'};
        System.out.println(obj.nextGreatestLetter(letters, 'a')); // c
        System.out.println(obj.nextGreatestLetter(letters, 'c')); // f
        System.out.println(obj.nextGreatestLetter(letters, 'j')); // c
    }
}
