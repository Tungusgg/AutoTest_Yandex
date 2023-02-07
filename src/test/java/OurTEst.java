import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.SetUpp;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OurTEst extends SetUpp {
    @Test
    public void Tesst() {
        driver.get("https://www.yandex.ru/search/?text=%D0%BF%D0%B5%D1%80%D0%B5%D0%B2%D0%BE%D0%B4%D1%87%D0%B8%D0%BA+%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD&lr=213");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"Translate-TextareaWrap\"]")));
        driver.findElement(By.xpath("//div[@class=\"Translate-Input Translate-Input_size_xl Translate-Input_empty Translate-Input_paste\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea")).sendKeys("House");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=contains(text(), 'Дом')])[last()]")));
        System.out.println("Test-case1 - passed");
        driver.findElement(By.xpath("//div[@title=\"Очистить\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea[@placeholder=\"Введите текст\"]")));
        driver.findElement(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea")).sendKeys("Well, i didn't have a car");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=contains(text(), \"Ну, у меня не было машины\")])[last()]")));
        System.out.println("Test-case2 - passed");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//span[@class=contains(text(), \"Английский\")]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//span[@class=contains(text(), \"Русский\")]")));
        driver.findElement(By.xpath("//div[@class=\"Translate-ReverseButton Translate-ReverseButton_focused_false Translate-Icon\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//span[@class=contains(text(), \"Русский\")]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//span[@class=contains(text(), \"Английский\")]")));
        System.out.println("Test-case4 - passed");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"Translate-Icons Translate-Icons_type_to\"]//div[@role=\"button\"]"))).click();
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"Translate-Input Translate-Input_size_xl Translate-Input_empty Translate-Input_paste\"]/div[@title=\"Вставить текст\"]"))).click();
        System.out.println("Test-case5 - passed");
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"Translate-TextareaWrap\"]")));
        driver.findElement(By.xpath("//div[@class=\"Translate-Input Translate-Input_size_xl Translate-Input_empty Translate-Input_paste\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea")).sendKeys("Բարեւ ձեզ");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=contains(text(), 'Привет')])[last()]")));
        System.out.println("Test-case6 - passed");
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"Translate-TextareaWrap\"]")));
        driver.findElement(By.xpath("//div[@class=\"Translate-Input Translate-Input_size_xl Translate-Input_empty Translate-Input_paste\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea")).sendKeys("Ггусь");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=contains(text(), \"I 'm learning\")])[last()]")));
        System.out.println("Test-case7 - passed");
        driver.navigate().refresh();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"Translate-TextareaWrap\"]")));
        driver.findElement(By.xpath("//div[@class=\"Translate-Input Translate-Input_size_xl Translate-Input_empty Translate-Input_paste\"]")).click();
        driver.findElement(By.xpath("//span[@class=\"Translate-TextareaWrap\"]//textarea")).sendKeys("SELECT * FROM translate;");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class=contains(text(), \"ВЫБЕРИТЕ * ИЗ СПИСКА перевести;\")])[last()]")));
        System.out.println("Test-case11 - passed");


    }
}
