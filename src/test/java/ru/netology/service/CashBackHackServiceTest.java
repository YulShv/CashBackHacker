package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {
    @Test
    public void shouldShowRemainWhenBelowBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowZeroWhenBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowRemainWhenAboveBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

}