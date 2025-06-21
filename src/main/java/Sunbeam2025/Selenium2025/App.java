package Sunbeam2025.Selenium2025;

import java.lang.foreign.Linker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class App 
{
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
      //  System.setProperty("webdriver.chrome.driver", "C:\Cromedriver.exe");
        
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        
        
      
        
        
       driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
    }
   
}
