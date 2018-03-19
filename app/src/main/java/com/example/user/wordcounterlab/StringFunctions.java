package com.example.user.wordcounterlab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by user on 19/03/2018.
 */

public class StringFunctions {

    private String stringOfWords;

    public StringFunctions(String words) {
        this.stringOfWords = words;
    }

    public int wordCount() {

        String[] arrayOfWords = this.stringOfWords.split(" ");
        return arrayOfWords.length;
    }

    public HashMap<String,Integer> getWordTally() {
        String[] arrayOfWords = this.stringOfWords.split(" ");
        ArrayList<String> arrayListOfWords = new ArrayList<>(Arrays.asList(arrayOfWords));

        HashMap<String,Integer> wordTally = new HashMap<>();
        for ( String word : arrayOfWords) {
            int numberOfOccurrences = Collections.frequency(arrayListOfWords, word);
            wordTally.put(word, numberOfOccurrences);
        }
        return wordTally;
    }




}
