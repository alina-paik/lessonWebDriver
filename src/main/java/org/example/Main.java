package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.imdb.com/");
        WebElement input = webDriver.findElement(By.xpath("//input[@id='suggestion-search']"));
        WebElement searchButton = webDriver.findElement(By.xpath("//button[@id='suggestion-search-button']"));
            input.clear();
            input.sendKeys("moving");
            searchButton.click();
            
        webDriver.quit();
    }
}