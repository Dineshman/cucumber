package or.ho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectMo {
	public PageObjectMo()
	{
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id="J_searchTxt")
	private WebElement search;
	@FindBy(xpath="//span[@class=\"right-search J_header_search J_header_search_true\"]")
	private WebElement cli;
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	public WebElement getCli() {
		return cli;
	}
	public void setCli(WebElement cli) {
		this.cli = cli;
	}
	
	
	
}
