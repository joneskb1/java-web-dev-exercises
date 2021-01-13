package org.launchcode.java.studio.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class ArrayStudio {

    public static void main(String[] args) {

        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();


        for(int i=0; i<charactersInString.length; i ++) {
            int count1 = 0;
            letterCount.put(charactersInString[i], count1);
        }


        for (Map.Entry<Character, Integer> letterCounts1 : letterCount.entrySet()) {
            int count = 0;
            char keyString = letterCounts1.getKey();
            for(int i=0; i<charactersInString.length; i ++) {
                if (charactersInString[i] == keyString) {
                    count += 1;
                    letterCounts1.setValue(count);

                }
            }

        }







        for (Map.Entry<Character, Integer> letterCounts : letterCount.entrySet()) {
            System.out.println(letterCounts.getKey() + " (" + letterCounts.getValue() + ")");
        }


    }


}


