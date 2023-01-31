package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testRemainIfFullSum() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.testng.annotations.Test
    public void testRemainIfUnderMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}