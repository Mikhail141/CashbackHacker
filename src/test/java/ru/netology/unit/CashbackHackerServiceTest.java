package ru.netology.unit;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackerServiceTest {
    CashbackHackerService cashback = new CashbackHackerService();

    @Test
    public void shouldAmount1000() {
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldAmountLess1000() {
        int actual = cashback.remain(900);
        int expected = 100;
        assertEquals (expected,actual);
    }

    @Test
    public void shouldAmountZero() {
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(expected,actual);
    }
}

