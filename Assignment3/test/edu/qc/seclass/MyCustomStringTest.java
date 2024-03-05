package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest {

    private MyCustomStringInterface myCustomString;

    @Before
    public void setUp() {
        myCustomString = new MyCustomString();
    }

    @After
    public void tearDown() {
        myCustomString = null;
    }

    @Test
    public void testCountNumbers1() {
        myCustomString.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, myCustomString.countNumbers());
    }

    @Test
    public void testCountNumbers2() {
        myCustomString.setString("");
        assertEquals(0, myCustomString.countNumbers());
    }

    @Test
    public void testCountNumbers3() {
        myCustomString.setString("12345");
        assertEquals(1, myCustomString.countNumbers());
    }

    @Test
    public void testCountNumbers4() {
        myCustomString.setString("abc no numbers");
        assertEquals(0, myCustomString.countNumbers());
    }

    @Test
    public void testCountNumbers5() {
        myCustomString.setString("1a2b3c");
        assertEquals(3, myCustomString.countNumbers());
    }

    @Test
    public void testCountNumbers6() {
        myCustomString.setString("987654 3210");
        assertEquals(2, myCustomString.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        myCustomString.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        myCustomString.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
        myCustomString.setString("abcdef");
        assertEquals("cf", myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
        myCustomString.setString("abcdef");
        assertEquals("a", myCustomString.getEveryNthCharacterFromBeginningOrEnd(6, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
        myCustomString.setString("test");
        assertEquals("test", myCustomString.getEveryNthCharacterFromBeginningOrEnd(1, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        myCustomString.setString("abcdef");
        assertEquals("ad", myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        myCustomString.setString("a");
        assertEquals("", myCustomString.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
        myCustomString.setString("Hello World");
        assertEquals("el ol", myCustomString.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
        myCustomString.setString(null);
        myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, true);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        myCustomString.setString("1234567890");
        assertEquals("24680", myCustomString.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        myCustomString.setString("1234567890");
        assertEquals("13579", myCustomString.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        myCustomString.setString("abcdefg");
        assertEquals("", myCustomString.getEveryNthCharacterFromBeginningOrEnd(10, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        myCustomString.setString("87654321");
        assertEquals("87654321", myCustomString.getEveryNthCharacterFromBeginningOrEnd(1, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        myCustomString.setString("0000");	// length check
    	myCustomString.getEveryNthCharacterFromBeginningOrEnd(3, true);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        myCustomString.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        myCustomString.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", myCustomString.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring2() {
        myCustomString.setString("12345");
        myCustomString.convertDigitsToNamesInSubstring(1, 5);
        assertEquals("OneTwoThreeFourFive", myCustomString.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring3() {
        myCustomString.setString("abc123");
        myCustomString.convertDigitsToNamesInSubstring(4, 6);
        assertEquals("abcOneTwoThree", myCustomString.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring4() {
        myCustomString.setString("Password: 1234");
        myCustomString.convertDigitsToNamesInSubstring(11, 14);
        assertEquals("Password: OneTwoThreeFour", myCustomString.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring5() {
        myCustomString.setString("000");
        myCustomString.convertDigitsToNamesInSubstring(1, 3);
        assertEquals("ZeroZeroZero", myCustomString.getString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring6() {
        myCustomString.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        myCustomString.convertDigitsToNamesInSubstring(5, 2);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        myCustomString.setString("Ends with 5");
        myCustomString.convertDigitsToNamesInSubstring(11, 11);
        assertEquals("Ends with Five", myCustomString.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        myCustomString.setString("1234567890");
        myCustomString.convertDigitsToNamesInSubstring(10, 10);
        assertEquals("123456789Zero", myCustomString.getString());
    }
}
