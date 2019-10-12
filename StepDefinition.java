package or.ho;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseC{
	PageObjectMo p=new PageObjectMo();
	@Given("Enter the cur url")
	public void enter_the_cur_url() {
	    launch("https://www.mi.com/in/");
		d.manage().window().maximize();

	}
	@When("Enter pro name Redmi {int}")
	public void enter_pro_name_Redmi(Integer int1)
	{
		type(p.getSearch(),int1);
		btn(p.getCli());
	    
	}

	@Then("Show pro spci")
	public void show_pro_spci()  {
	    
	}

}
