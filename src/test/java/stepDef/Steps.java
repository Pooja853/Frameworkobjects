package stepDef;

import org.openqa.selenium.WebDriver;

import com.PageObject.Footerpage;
import com.PageObject.Login;
import com.PageObject.Menupage;
import com.PageObject.Mybooking;
import com.PageObject.Newproject;
import com.PageObject.PayrentPage;
import com.PageObject.Postproperty;
import com.PageObject.Referandearn;
import com.PageObject.Searchpage;
import com.utility.BaseClass;
import com.utility.BrowserFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

public static WebDriver driver;
	//footerpage
@Given("^open Chrome and start browser$")
public void open_Chrome_and_start_browser() throws Throwable {
	
	BaseClass bc=new BaseClass();
	  driver= bc.setup();

}

@Then("^Click on the footer page$")
public void click_on_the_footer_page() throws Throwable {
   
	Footerpage foot=new Footerpage(driver);
	foot.footer();
}

@Then("^Click on the footer page$")
public void click_on_the_footer_page1() throws Throwable {
    
	BrowserFactory.quitBrowser(driver);
}
	
	//menupage
	
	@Given("^launch Chrome and start browser$")
	public void launch_Chrome_and_start_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();

	}

	@Then("^Click on Menu page$")
	public void click_on_Menu_page() throws Throwable {
		
		Menupage gp=new Menupage(driver);
		gp.menu();
	}

	@Then("^end the browser$")
	public void end_the_browser() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}
	
	//newproject
	
	@Given("^Open Chrome and start browsers$")
	public void open_Chrome_and_start_browsers() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Click on Newproject$")
	public void click_on_Newprojects() throws Throwable {
	    
		Newproject cp=new Newproject(driver);
		cp.newproj();
	}

	@Then("^Check for the UL picks text$")
	public void check_for_the_UL_picks_text() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}
	
	//nextpage
	
	@Given("^Open Chrome and run browser$")
	public void open_Chrome_and_run_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}
	
	

	@Then("^verify the We Accept text$")
	public void verify_the_We_Accept_text() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}
	//referanderan
	
		@Given("^Open refer page and earn ")
		public void refer() throws Throwable {
		    
			BaseClass bc=new BaseClass();
			  driver= bc.setup();
		}

		

		@Then("^verify the refer text$")
		public void verify_the_refer_text() throws Throwable {
		    
			Referandearn lg=new Referandearn(driver);
			lg.refer();
		}
		@Then("^verify We Accept text$")
		public void verify_We_Accept_text_() throws Throwable {
		    
			BrowserFactory.quitBrowser(driver);
		}
	//postproperty
	
	@Given("^open the chrome and launch the browser$")
	public void open_the_chrome_and_launch_the_browser() throws Throwable {
	   
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Click on the Postproperty page$")
	public void click_on_the_Postproperty_page() throws Throwable {
	
		Postproperty kp=new Postproperty(driver);
		kp.post();
	}

	@Then("^verify it accept link$")
	public void verify_it_accept_link() throws Throwable {
	  
		BrowserFactory.quitBrowser(driver);
	}
	
	//searchpage
	
	@Given("^launch the Chromebrowser$")
	public void launch_the_Chromebrowser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Enter the input in the search box and search $")
	public void Enter_the_input_in_the_search_box_and_search() throws Throwable {
	    
		Searchpage lp=new Searchpage(driver);
		lp.search();
	}

	@Then("^verify the We Accept text$")
	public void verify_the_We_Accept_text_() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}

	//mybooking
	
	@Given("^launch the Chrome$")
	public void launch_the_Chrome() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Check for the bookinfs$")
	public void Check_for_the_bookinfs() throws Throwable {
		
		Mybooking sp=new Mybooking(driver);
	    sp.mybookings();
	}

	@Then("^Stop the browser$")
	public void stop_the_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}
	
	//continous
	
	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}
	@Then("^continue the search by clicking on the link$")
	public void continue_the_search_by_clicking_on_the_link() throws Throwable {
	   
		PayrentPage stud=new PayrentPage(driver);
		stud.rent();
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
		BrowserFactory.quitBrowser(driver);
	}

	//payrent
	
	@Given("^launch the Chrome browser$")
	public void launch_the_Chrome_browser() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Pay the rent in the online$")
	public void Pay_the_rent_in_the_online() throws Throwable {
	   
		PayrentPage stud=new PayrentPage(driver);
		stud.rent();
	}

	@Then("^quit the chrome browser$")
	public void quit_the_chrome_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}

	//login
	
	@Given("^launch the browser and chrome$")
	public void launch_the_browser_and_chrome() throws Throwable {
	    
		BaseClass bc=new BaseClass();
		  driver= bc.setup();
	}

	@Then("^Login to the account by entering the fields$")
	public void Login_to_the_account_by_entering_the_fields() throws Throwable {
		
		Login tp=new Login(driver);
		tp.login();
	}

	@Then("^close the chrome browser$")
	public void close_the_chrome_browser() throws Throwable {
	    
		BrowserFactory.quitBrowser(driver);
	}



}
