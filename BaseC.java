package or.ho;

import org.openqa.selenium.WebElement;

public class BaseC {
	public void launch(String url)
	{
		Hook.driver.get(url);
	}
	public void type(WebElement e, Integer int1)
	{
		e.sendKeys(int1);
	}
	public void btn(WebElement e)
	{
		e.click();
	}
}
