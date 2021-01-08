package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;

public class Studio2 {
    public static void main(String[] args) {
        //HashMap<String, Integer> charString = new HashMap<>(quote);
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> charString = new HashMap<>();
        char[] charactersInQuote = quote.toCharArray();
        int count = 0;

        for(int i =0; i < charactersInQuote.length ;i++ ){
            char ch = charactersInQuote[i];
            charString.putIfAbsent(charactersInQuote[i],count);
            if (charString.containsKey(ch)){
                charString.put(ch, charString.get(ch) +1);
            }else{
                charString.put(ch, 1);
            }

            //System.out.println(charString.keySet());
            //System.out.println(charString.values());

            //if(charString.containsKey(i)){
            //}
        }
            // System.out.println(charString.keySet()+":"+ charString.values());
        System.out.println(charString);
    }
}