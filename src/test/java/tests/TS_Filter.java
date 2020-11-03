package tests;

import org.testng.annotations.Test;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import functionalities.CourseDetailsFunctionality;
import functionalities.FilterFunctionality;

public class TS_Filter extends BaseClass{
	
	public FilterFunctionality filter;
	public CourseDetailsFunctionality details;

	@BeforeTest
	public void TC_initiateClasses()
	{
		filter = new FilterFunctionality();
		details = new CourseDetailsFunctionality();
	}
	@Test(priority=1)
	public void TC_LanguagesDisplayed()
	{
		openUrl();
		details.search("Language Learning");
		details.searchClick();
		filter.setLanguage();
	}
	@Test(priority=2)
	public void TC_ExtractLanguageDetails()
	{
		filter.extractLanguageDetails();
	}
	@Test(priority=3)
	public void TC_LevelsDisplayed()
	{
		filter.setLevels();
	}
	@Test(priority=4)
	public void TC_ExtractLevelsDetails()
	{
		filter.extractLevelDetails();
	}
	

}
