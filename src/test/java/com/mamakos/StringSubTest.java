package com.mamakos;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringSubTest {

    @Test
    public void sum() {
        assertEquals("2",StringSub.sum("1","1"));
        assertEquals("1",StringSub.sum("1.1","1"));
        assertEquals("0",StringSub.sum("1.2",".2"));
        assertEquals("200",StringSub.sum("100","100"));
        assertEquals("0",StringSub.sum("",""));
        assertEquals("2",StringSub.sum("1","1"));
        assertEquals("1",StringSub.sum("ABC","1"));
    }
}