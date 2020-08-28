package org.eggtimer.tests;

import org.eggtimer.config.Configurations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sanity extends Configurations {

    private static final By MORNING_TIMER = By.xpath("//b[contains(text(),'morning')]");


    @Test
    public void morningTimerTest() throws InterruptedException {
        driver.findElement(MORNING_TIMER).click();
        Assert.assertEquals("https://e.ggtimer.com/morning",driver.getCurrentUrl());

    }

}
