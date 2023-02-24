package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//In this class we will store WebElements common to all pages
//https://web-table-2.cydeo.com/create-order çünkü bu sitede web sayfasının solundaki kısım değişmezken sağ taraftaki içerik değişiyor o yüzden her sayfa için tekrar locate etmek yerine bir kere yapıp diğer classların bu base page'i extend etmesini sağlıycaz
public class BasePage {

    public BasePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[. = 'View all orders']")
    public WebElement viewAllOrders;

    @FindBy(xpath = "//button[. = 'View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//button[. = 'Order']")
    public WebElement order;

    @FindBy(xpath = "//button[. = 'Logout']")
    public WebElement logoutButton;




}
