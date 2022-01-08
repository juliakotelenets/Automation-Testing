package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/product/274661/' and @data-default-name='Атомайзер для парфюмерии, серебристый - Makeup ']")
    private WebElement parfumeProduct;

    @FindBy(xpath = "//h1[@class='page-header']")
    private WebElement title;

    @FindBy(xpath = "//span[@class='price_item' and contains(text(),'55')]")
    private WebElement priceOfProduct;

    @FindBy(xpath = "//a[@href='/product/125797/']")
    private WebElement shampooProduct;

    public WebElement getShampooProduct(){ return shampooProduct; }

    public WebElement getParfumeProduct(){ return  parfumeProduct; }

    public String getTitleText() {
        return title.getText();
    }

    public void clickToParfumeProduct(){
        parfumeProduct.click();
    }

    public String getTextOfPrice(){
        return priceOfProduct.getText();
    }

    public void clickToShampoo(){
        shampooProduct.click();
    }

}
