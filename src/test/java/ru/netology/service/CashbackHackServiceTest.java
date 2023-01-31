package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainIfSmallestSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfOneRubleLucks() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
        public void testRemainIfFullSum () {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(expected, actual);
        }

        @Test
        public void testRemainIfUnderMin () {
            CashbackHackService service = new CashbackHackService();
            int amount = 1001;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(expected, actual);
        }
    }