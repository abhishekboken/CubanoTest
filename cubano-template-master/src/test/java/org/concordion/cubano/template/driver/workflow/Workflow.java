package org.concordion.cubano.template.driver.workflow;

import org.concordion.cubano.driver.BrowserBasedTest;
import org.concordion.cubano.template.driver.services.ExampleRestApi;
import org.concordion.cubano.template.driver.ui.google.NZCitizenCheck;

public class Workflow {
    private final BrowserBasedTest test;

    public Workflow(BrowserBasedTest test) {
        this.test = test;
    }

    public NZCitizenCheck openNZWebsite() {
        return NZCitizenCheck.openUrl(test);
    }
    
    public ExampleRestApi restExample() {
        return new ExampleRestApi();
    }
}
