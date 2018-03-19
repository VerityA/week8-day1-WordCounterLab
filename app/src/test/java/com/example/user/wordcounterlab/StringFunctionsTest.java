package com.example.user.wordcounterlab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 19/03/2018.
 */

public class StringFunctionsTest {

    StringFunctions stringFunctions;

    @Before
    public void before() {
        stringFunctions = new StringFunctions("I am trying out something new");
    }

    @Test
    public void canGetWordCount() {
        assertEquals(6, stringFunctions.wordCount());
    }
}
