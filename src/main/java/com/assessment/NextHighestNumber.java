package com.assessment;

import java.util.Arrays;
import java.util.Stack;

public class NextHighestNumber {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Input is empty. Please provide input");
            return;
        }

        System.out.println("Next highest number for "+ args[0] +" is : "
                + nextHighestNumber(args[0]));
    }

    /**
     * Get next highest number possible with given digits
     * @param input
     * @return Next highest number
     */
    public static int nextHighestNumber(String input) {
        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException ex){
            System.out.println("Invalid input. Input must be a valid positive integer.");
            return -1;
        }

        if(num < 0) {
            System.out.println("Invalid input. Input must be a valid positive integer.");
            return -1;
        }

        if(num < 10){
            System.out.println("Next highest number cannot be determined for the given input");
            return -1;
        }

        StringBuilder inputStringBuilder = new StringBuilder(input);
        Stack<Integer> increasingSeqStack = new Stack();

        for(int i = inputStringBuilder.length()-1; i > 0; i --) {
            //find the first digit that is smaller than the digit next to it
            while(i > 0 && inputStringBuilder.charAt(i-1) >= inputStringBuilder.charAt(i)) {
                increasingSeqStack.add(i);
                i--;
            }

            if(i > 0) {
                char noToReplace = inputStringBuilder.charAt(i-1);
                int nextHighestIdx =  i;

                //find next highest digit - more in  readme -> logic section -> step 2
                while(!increasingSeqStack.isEmpty() &&
                        inputStringBuilder.charAt(increasingSeqStack.peek())>noToReplace) {
                    nextHighestIdx = increasingSeqStack.pop();
                }

                inputStringBuilder.setCharAt(i-1, inputStringBuilder.charAt(nextHighestIdx));
                inputStringBuilder.setCharAt(nextHighestIdx, noToReplace);
                char[] temp = inputStringBuilder.substring(i).toCharArray();
                Arrays.sort(temp); //sort to find smallest value from starting to i
                String nextHighestStr = inputStringBuilder.substring(0, i) + new String(temp);
                return new Long(nextHighestStr) > Integer.MAX_VALUE ? -1 : new Integer(nextHighestStr);
            }
        }

        System.out.println("Next highest number cannot be determined for the given input");
        return -1;
    }
}
