package org.concordion.cubano.template.driver.ui.google;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.template.AppConfig;
import org.concordion.cubano.template.driver.ui.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NZCitizenCheck extends PageObject<NZCitizenCheck> {
	public NZCitizenCheck(BrowserBasedTest test) {
		super(test);
	}

	@FindBy(css = "#EditableFormStep_e7810 > h1")
	WebElement pageHeading;
	
	@FindBy(className = "step-button-next")
	WebElement clickNextButton;
	
	@FindBy(className = "radio")
	List<WebElement> radioButton;
	
	@FindBy(css = "#EditableFormStep_312a3 > h1")
	WebElement citizenshipStatusText;
	
    public static NZCitizenCheck openUrl(BrowserBasedTest test) {
        test.getBrowser().getDriver().navigate().to(AppConfig.getInstance().getSearchUrl());
        return new NZCitizenCheck(test);
    }

	public NZCitizenCheck selectRadioButton(String Value) {
		int radioOption = radioButton.size();
		for (int i = 0; i < radioOption; i++) {
			try {
				String sValue = radioButton.get(i).getAttribute("value");
				if (sValue.equalsIgnoreCase(Value) && radioButton.get(i).isDisplayed()) {
					radioButton.get(i).click();
					break;
				}
			} catch (Exception e) {
				System.out.println("next");
			}
		}
		return this;
	}

	public NZCitizenCheck clickNextButton() {
		clickNextButton.click();
		return this;
	}

	public String citizenshipStatus() {
		return citizenshipStatusText.getText();
	}

	@Override
	public ExpectedCondition<?> pageIsLoaded(Object... params) {
		return ExpectedConditions.visibilityOf(pageHeading);
	}
}
