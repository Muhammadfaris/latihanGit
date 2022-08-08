package org.example;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    //adalah kumpulan inisiasi webdriver dan open browser ke web tujuan dan quit browser
    WebDriver driver;
    WebDriverWait w;

    // setiap kali anotasi @Test dijalankan, maka @Before ini berjalan lebih dulu
    @Before
    public void openWebBrowser(){
        System.out.println("Before Test");
        // lokasi web driver
        System.setProperty("webdriver.chrome.driver", "F:\\QA Cilsy\\webDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        // open web tujuan : midtrans
        driver.get("https://demo.midtrans.com/#");
        driver.manage().window().maximize();
        w = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    // @After ini akan jalan ketika @Test selesai di jalankan
//    @After
    public void closeWebBrowser(){
        driver.quit();
    }
}
