package br.com.pmshirotsu.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraSansungTeste {

    @Test
    public void deveSubtrairValores() throws MalformedURLException {

        //capacidades
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        desiredCapabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        //driver de conexão e inicializar
        AndroidDriver<WebElement> driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

        //Fazendo uma busca por elemento - por id
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("9");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("8");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("7");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("6");
        el4.click();
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("5");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("4");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("0");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("3");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Menos");
        el9.click();
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByAccessibilityId("1");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("3");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("4");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("8");
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementByAccessibilityId("9");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("7");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("6");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByAccessibilityId("5");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("0");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("Visualizar resultado 852.767.753");
        el19.click();

        System.out.println(el19.getText());

        //Validações
        Assert.assertEquals("852.767.753",el19.getText());

        //encerar a sessão
        driver.quit();
    }
}
