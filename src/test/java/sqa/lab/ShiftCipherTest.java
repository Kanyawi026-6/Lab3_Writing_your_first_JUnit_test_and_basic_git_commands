package sqa.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShiftCipherTest {

    // TC01: Positive case
    @Test
    void TC01() {

        ShiftCipher cipher = new ShiftCipher();

        assertEquals(
            "DEF",
            cipher.shift("ABC", 3)
        );
    }


    // TC02: Positive case
    @Test
    void TC02() {

        ShiftCipher cipher = new ShiftCipher();

        assertEquals(
            "ABC",
            cipher.shift("XYZ", 3)
        );
    }


    // TC03: Additional Positive case
    @Test
    void TC03() {

        ShiftCipher cipher = new ShiftCipher();

        assertEquals(
            "MJQQT",
            cipher.shift("HELLO", 5)
        );
    }


    // TC04: Additional Negative case
    @Test
    void TC04() {

        ShiftCipher cipher = new ShiftCipher();

        assertEquals(
            "invalid",
            cipher.shift("Hello", 3)
        );
    }

}