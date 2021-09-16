package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,30);

        Select select = new Select(driver.findElement(By.id("select-demo")));

        //Printing the options using getoptions()
        List<WebElement> optionsList = select.getOptions();

        System.out.println("The options present are: ");
        for (int i = 0; i < optionsList.size() ; i++) {
            String allOptions = optionsList.get(i).getText();
            System.out.println(allOptions);
        }

        //selectByVisibleText
        select.selectByVisibleText("Wednesday");

        //getFirstSelected and show the selected option
        WebElement option = select.getFirstSelectedOption();
        String showOption = option.getText();
        System.out.println("Option selected is:  " + showOption);

        Thread.sleep(1000);

        //Multi-select dropdown -- selecting and de-selecting by using various methods
        Select select2Dropdown = new Select(driver.findElement(By.id("multi-select")));
        select2Dropdown.selectByIndex(2);

        WebElement option2 = select2Dropdown.getFirstSelectedOption();
        String showOption2 = option2.getText();
        System.out.println("\nOption selected from the second dropdown is: " + showOption2);

        System.out.println("Selecting another value using .selectByValue(): ");
        select2Dropdown.selectByValue("Ohio");
        System.out.println("Deselecting the options ");
        select2Dropdown.deselectAll();

        Thread.sleep(1000);

        select2Dropdown.selectByIndex(5);
        select2Dropdown.selectByIndex(6);
        select2Dropdown.selectByIndex(7);

        Thread.sleep(1000);

        //Print all the selected options
        List<WebElement> selected = select2Dropdown.getAllSelectedOptions();

        System.out.println("\nThe options selected are: ");
        for (int i = 0; i < selected.size() ; i++) {
            String allSelectedOptions = selected.get(i).getText();
            System.out.println(allSelectedOptions);
        }

        //check if the dropdown supports multiple selection
        boolean check = select2Dropdown.isMultiple();
        System.out.println("The dropdown supports multiple options : " + check);

        select2Dropdown.deselectByValue("Texas");
        select2Dropdown.deselectByIndex(7);




    }
}
