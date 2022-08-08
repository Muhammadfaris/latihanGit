package org.example.pageObject;

import org.example.helper.seleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends seleniumHelper {
//    WebDriver driver;
    By title = By.xpath("//div[@class='title']");
    By buttonBuyNow = By.xpath("//a[.='BUY NOW']");

    // Form Shopping Cart
    By inputAmmount = By.xpath("//input[@class='text-right']");
    By inputName = By.xpath("//td[.='Name']/following-sibling::td/input");
    By inputEmail = By.xpath("//td[.='Email']/following-sibling::td/input");
    By inputPhoneNumber = By.xpath("//td[.='Phone no']/following-sibling::td/input");
    By inputCity = By.xpath("//td[.='City']/following-sibling::td/input");
    By inputAddress = By.xpath("//td[.='Address']/following-sibling::td/textarea");
    By inputPostalCode = By.xpath("//td[.='Postal Code']/following-sibling::td/input");
    By buttonCheckout = By.xpath("//div[@class='cart-checkout']");



    //jangan lupa untuk buat contructornya karena nanti akan di panggil di kelas main testnya, untuk memanggil method" di bawahnya
    public HomePage(WebDriver driver) {
        super(driver); // ini untuk merujuk ke method seleniumHelper atau parentnya
//        this.driver = driver;
    }

    public boolean isDisplayed(){
        return driver.findElement(title).isDisplayed();
//      Assert.assertEquals(expectedHomeTitle,homeTitle); //Assert tidak bisa di panggil di .java
    }

    public String getTitle(){
        return driver.findElement(title).getText();
    }

    public void clickBuyNow(){
        driver.findElement(buttonBuyNow).click();
    }

    public void fillFormCheckout(String ammount, String name,String email,String phonenumber,String city,
                                 String address,String postalcode){

        setText(inputAmmount, ammount);
        setText(inputName, name);
        setText(inputEmail, email);
        setText(inputPhoneNumber, phonenumber);
        setText(inputCity, city);
        setText(inputAddress, address);
        setText(inputPostalCode, postalcode);
        driver.findElement(buttonCheckout).click();

//        di bawah ini adalah kodingan sebelumnya, kemudian di persngkat menjadi di atas dengan menggunakan helper dimana membuat method tersendiri untuk gabungan clear dan send key menjadi seetText
//        driver.findElement(inputAmmount).clear();
//        driver.findElement(inputAmmount).sendKeys(ammount);
//        driver.findElement(inputName).clear();
//        driver.findElement(inputName).sendKeys(name);
//        driver.findElement(inputEmail).clear();
//        driver.findElement(inputEmail).sendKeys(email);
//        driver.findElement(inputPhoneNumber).clear();
//        driver.findElement(inputPhoneNumber).sendKeys(phonenumber);
//        driver.findElement(inputCity).clear();
//        driver.findElement(inputCity).sendKeys(city);
//        driver.findElement(inputAddress).clear();
//        driver.findElement(inputAddress).sendKeys(address);
//        driver.findElement(inputPostalCode).clear();
//        driver.findElement(inputPostalCode).sendKeys(postalcode);

    }
}
