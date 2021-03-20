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
    public void deveSomarDoisValores() throws MalformedURLException {

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
        MobileElement el4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        el7.click();
        System.out.println(el7.getText());

        //Validações
        Assert.assertEquals("4",el7.getText());

        //encerar a sessão
        driver.quit();
    }
}
