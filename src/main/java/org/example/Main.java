package org.example;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.model.AudioListenerWillBeDestroyed;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import java.time.Duration;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //******Delay being added for visualization purposes******


        //Task Excecuted: Filling out a form with multiple actions
        //All methods written down below after main

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        submitForm(driver); //calls submitForm method

        waitForAlertBanner(driver);

        String textExpected = "The form was successfully submitted!";

        textExpected.equals(getAlertForBanner(driver)); // checks if text matches by calling in getAlertForBanner method

        Thread.sleep(600); // adding delay
        driver.quit();


        /*
        //Task Excecuted: using explicit waits on autocomplete
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement Address = driver.findElement(By.id("autocomplete")); // Finding field to type name in
        Address.sendKeys("688 Satsuma Terrace, Sunnyvale, CA 94087");
        //time delay by explicit wait
        WebDriver wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // specify time to wait
        // finding auto completed address after time delay
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item"))); // sees if condition is true every 500 ms until 10s
        autocompleteResult.click();
        Thread.sleep(400); // adding delay
        driver.quit();
        
         */


        /*
        //Task Excecuted: using implicit waits on modal
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement OpenNewTabButton = driver.findElement(By.id("new-tab-button"));
        OpenNewTabButton.click();
        //time delay with implicit wait
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        String originalHandle = driver.getWindowHandle(); // getting OG window handle
        //switching to second tab that is open
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);//switch back to OG tab
        driver.manage().timeouts().implicitlyWait(400, TimeUnit.MILLISECONDS);// adding delay
        driver.quit();
        */


        /*
        //Task Excecuted: File Upload
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileField = driver.findElement(By.id("file-upload-field"));
        fileField.click();
        Thread.sleep(700); // adding delay
        fileField.sendKeys("image.png");//inputting file name wanting to be uploaded
        Thread.sleep(700); // adding delay
        //clearing file field
        WebElement resetButton = driver.findElement(By.xpath("/html/body/div/form/div/div/span[2]/button"));
        resetButton.click();


        //closing app
        Thread.sleep(500); // adding delay
        driver.quit();
         */

        /*
        //Task Excecuted: Dropdown Menu
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownButton = driver.findElement(By.id("dropdownMenuButton"));
        Thread.sleep(375); // adding delay
        dropdownButton.click();

        WebElement menuItem = driver.findElement(By.xpath("/html/body/div/div/div/a[5]"));
        Thread.sleep(400); // adding delay
        menuItem.click();

        //closing app
        Thread.sleep(500); // adding delay
        driver.quit();

         */

        /*
        //Task Excecuted: Date Picker
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement dateFeild = driver.findElement(By.id("datepicker"));
        Thread.sleep(450); // adding delay
        //directly sending a specific date to feild
        dateFeild.sendKeys("03/20/2003");
        Thread.sleep(650); // adding delay
        dateFeild.sendKeys(Keys.RETURN);//presses ENTER Key after selecting date

        //closing app
        Thread.sleep(500); // adding delay
        driver.quit();
         */

        /*
        //Task Excecuted: Finding buttons by multiple cssSelectors
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();
        //find by value
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        radioButton2.click();
        //find by xPath
        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton3.click();
        //closing app
        Thread.sleep(400); // adding delay
        driver.quit();
         */

        /*
         //Task Excecuted: Drag & Drop
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Thread.sleep(300); // adding delay

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image,box).build().perform(); // puts image in box using dragAndDrop function
        Thread.sleep(300); // adding delay

        driver.quit();

         */


        /*
        //Task Excecuted: Switching to alert -> Popping up a alert window on tab and closing it
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();

        WebElement closeButton = driver.findElement(By.id("close-button"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeAsyncScript("argument[0].click();", closeButton);// JavascriptExecutor js will execute and press the close button
        Thread.sleep(400); // adding delay

        driver.quit();
        */

        /*
        //Task Excecuted: Switching to alert -> Popping up a alert window on tab and closing it
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement AlertButton = driver.findElement(By.id("alert-button"));
        AlertButton.click();
        //switching to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(500); // adding delay
        alert.accept(); // pressing 'OK' to alert
        Thread.sleep(400); // adding delay
        driver.quit();
       */

        /*
         //Task Excecuted: Switching to active window -> opening a new tab
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement OpenNewTabButton = driver.findElement(By.id("new-tab-button"));
        OpenNewTabButton.click();
        Thread.sleep(1000); // adding delay
        String originalHandle = driver.getWindowHandle(); // getting OG window handle
        //switching to second tab that is open
        for (String handle1: driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);//switch back to OG tab
        Thread.sleep(400); // adding delay
        driver.quit();
        */

        /*
        //Task Excecuted: Scrolling
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");
        WebElement name = driver.findElement(By.id("name")); // Finding field to type name in
        Actions actions = new Actions(driver);
        actions.moveToElement(name); // specifying where you want to move to -> name
        name.sendKeys("Taanish Patel"); //filling name field
        WebElement date = driver.findElement(By.id("date")); // Finding field to type date in
        actions.moveToElement(date); // specifying where you want to move to -> date
        date.sendKeys("03/20/2003"); // filling date field
        Thread.sleep(400); // adding delay
        driver.quit();
        */


        /*
        //Task Excecuted: Using Autocomplete
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement Address = driver.findElement(By.id("autocomplete")); // Finding field to type name in
        Address.sendKeys("688 Satsuma Terrace, Sunnyvale, CA 94087");
        Thread.sleep(1000); // adding delay
        WebElement CompleteAddress = driver.findElement(By.className("pac-item"));// finding auto completed address
        CompleteAddress.click();
        Thread.sleep(400); // adding delay
        driver.quit();
        */


        /*
        //Task Excecuted: Keyboard and mouse input
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name")); // Finding field to type name in
        name.click();//click into field to make it active
        name.sendKeys("Taanish Patel");//Inputting name into said field

        WebElement button = driver.findElement(By.id("button")); // Finding button element
        button.click(); // click the button
        Thread.sleep(400); // adding delay
        driver.quit();
        */


        /*
        //Task Excecuted: Opening a URl

        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();
        // And now use this to visit Google
        driver.get("https://www.espn.com/nba");
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Enter something to search for
        element.sendKeys("Cheese!");
        // Now submit the form
        element.submit();
        Thread.sleep(400); // adding delay
        //Close the browser
        driver.quit();
        */

    }

    public static void submitForm (WebDriver driver) throws InterruptedException {

        driver.findElement(By.id("first-name")).sendKeys("Taanish"); // finding and sending keys to element
        Thread.sleep(300);
        driver.findElement(By.id("last-name")).sendKeys("Patel"); // finding and sending keys to element
        Thread.sleep(300);
        driver.findElement(By.id("job-title")).sendKeys("Developer"); // finding and sending keys to element
        Thread.sleep(300);
        driver.findElement(By.id("radio-button-2")).click(); // finding and clicking element
        Thread.sleep(300);
        driver.findElement(By.id("checkbox-2")).click(); // finding and clicking element
        Thread.sleep(300);
        //choosing cssSelector to use drop down menu
        driver.findElement(By.cssSelector("option[value='2']")).click();
        Thread.sleep(300);
        driver.findElement(By.id("datepicker")).sendKeys("03/20/2003"); // finding and sending keys to element
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN); //presses ENTER Key after selecting date thus closing the calendar
        Thread.sleep(400);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click(); //finding and clicking element by using cssSelector and giving in classes at the attribute
    }

    public static void waitForAlertBanner(WebDriver driver){
        // Adding explicit wait on alert banner to confirm submission of form was successful
        //waiting for thanks page to appear
        //waiting up to 10s for alert class to be visible on page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("alert"))));

    }

    public static String getAlertForBanner(WebDriver driver){
        //returns texts displayed on page
        return driver.findElement(By.className("alert")).getText();
    }

}