package example.govtNz;

import example.ConcordionFixture;

public class CheckNZCitizenshipFixture extends ConcordionFixture {
	public String govtNZ() {
		return workflow()
				.openNZWebsite().
				selectRadioButton("No").
				clickNextButton().
				selectRadioButton("No").
				clickNextButton().
				selectRadioButton("No").
				clickNextButton().
				selectRadioButton("Yes").
				clickNextButton().
				citizenshipStatus();
		}
}