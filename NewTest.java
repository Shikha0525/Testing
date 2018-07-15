package com.qait.automation.Seleniuim;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qait.automation.Selenium.BrowserFactory;
import com.qait.automation.Selenium.PageFactory;

public class NewTest {
	
	WebDriver driver;
	PageFactory pagefactory;
  
    @BeforeTest
    public void beforetest(){
    	
    	System.setProperty("webdriver.chrome.driver", "E:\widget\ReqRes");
    	driver=BrowserFactory.startWebBrowser("chrome", "https://reqres.in/");
    	
    }
	
	@Test
    public void test01LaunchBrowser() {
	  
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
	
    }
	
	@Test
	public void test02listusers(){
		pagefactory.listusers();
		
	}
	
	@Test
	public void test03singleusers(){
		pagefactory.singleusers();
	    	
	}
	
	@Test
	public void test04userssinglenotfound(){
		 pagefactory.userssinglenotfound();
		
	}
	
	@Test
	public void test05unknown(){
		 pagefactory.unknown();
		 
	}
	
	@Test
	public void test06unknownsingle(){
		pagefactory.unknownsingle();
		
	}
	
	@Test
	public void test07unknownsinglenotfound(){
		pagefactory.unknownsinglenotfound();
		
	}
	
	@Test
	public void test08post(){
		 pagefactory.post();
	}
	
	@Test
	public void test09put(){
		pagefactory.put();
		
	}
	
	@Test
	public void test10patch(){
		pagefactory.patch();
	}
	
	@Test
	public void test11delete(){
		pagefactory.delete();
	}
	
	@Test
	public void test12registersuccessful(){
		pagefactory.registersuccessful();
	}
	
	@Test
	public void test13registerunsuccessful(){
		 pagefactory.registerunsuccessful();
	}
	
	@Test
	public void test14loginsuccessful(){
		 pagefactory.loginsuccessful();
	}
	
	@Test
	public void test15loginunsuccessful(){
		pagefactory.loginunsuccessful();
	}
	
	@Test
	public void test16delay(){
		pagefactory.delay();
	}
}
