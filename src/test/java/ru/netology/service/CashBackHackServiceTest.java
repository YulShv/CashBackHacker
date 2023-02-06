package ru.netology.service;

import static org.testng.Assert.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackHackServiceTest {
    @Test
    public void shouldShowRemainWhenBelowBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowZeroWhenBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainWhenAboveBoundary() {
        CashBackHackService service = new CashBackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }



}