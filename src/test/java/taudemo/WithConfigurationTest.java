package taudemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

@TestInstance(Lifecycle.PER_CLASS)
public class WithConfigurationTest {

  private BrowserGetter browserGetter = new BrowserGetter();
  private WebDriver driver;

  @

  @BeforeAll
  public void beforeAll() {
    driver = browserGetter.getDriver();

  }

  @Test
  public void justATest() {
    driver.get("https://www.example.com");
    assertEquals(driver.getTitle(), "Example domain");
  }

  @AfterAll
  public void afterAll() {
    driver.quit();
  }

}
