package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {
    public static void main(String[] args) {
        // Устанавливаем путь к драйверу Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\melnikov\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // Создаем экземпляр ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Открываем страницу регистрации Gmail
        driver.get("https://accounts.google.com/signup");

        // Заполняем форму регистрации
/*        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Ferdy");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Kprpfigers");*/

        //WebElement username = driver.findElement(By.name("Username"));
        //username.sendKeys("Ferdy.Kprpfigers1222111");

/*        WebElement password = driver.findElement(By.name("Passwd"));
        password.sendKeys("Hello00moto99");

        WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
        confirmPassword.sendKeys("Hello00moto99");*/

         WebElement nextButton = driver.findElement(By.xpath("//span[text()='Далее']"));
        //WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
        //WebElement nextButton = driver.findElement(By.className("VfPpkd-RLmnJb"));
        nextButton.click();

        // Заполняем дополнительную информацию
        // WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
        // phoneNumber.sendKeys("1234567890");

/*        WebElement birthMonth = driver.findElement(By.id("month"));
        birthMonth.sendKeys("January");

        WebElement birthDay = driver.findElement(By.id("day"));
        birthDay.sendKeys("11");

        WebElement birthYear = driver.findElement(By.id("year"));
        birthYear.sendKeys("2000");

        WebElement gender = driver.findElement(By.id("gender"));
        gender.sendKeys("Male");

        nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
        nextButton.click();

        // Подтверждаем номер телефона
        // WebElement verificationCode = driver.findElement(By.name("code"));
        // verificationCode.sendKeys("123456");

        // nextButton = driver.findElement(By.xpath("//span[text()='Verify']"));
        // nextButton.click();

        // Завершаем регистрацию
        nextButton = driver.findElement(By.xpath("//span[text()='Done']"));
        nextButton.click();

        // Закрываем браузер
        driver.quit();*/
    }
}

