package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // System.setProperty("webdriver.gecko.driver", "C:\\Users\\melnikov\\Downloads\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\melnikov\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syncfusion.com/");
        System.out.println("Successfully opened the website www.Syncfusion.com");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        driver.quit();
    }
}

