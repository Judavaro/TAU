package taudemo;

// one

/**
 * commit two java doc
 */

//todo for dont unforget something

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

@TestInstance(Lifecycle.PER_CLASS)
public class SeleniumTest {

  private BrowserGetter browserGetter = new BrowserGetter();
  private WebDriver driver;

  @BeforeAll
  public void beforeAll() {
    driver = browserGetter.getChromeDriver();
  }

  @Test
  public void openThePageAndCheckTheTitle() {
    String expectedTitle = "Example title";
    driver.get("https://www.example.com");
    assertEquals(expectedTitle, driver.getTitle());
  }

  @AfterAll
  public void afterAll() {
    driver.quit();
  }
}