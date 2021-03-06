package org.concordion.cubano.template.driver.services;

import java.io.IOException;

import org.concordion.cubano.driver.http.HttpEasy;

public class ExampleRestApi extends ServiceBase {

    public String getIPAddress() throws IOException {
        // NOTE: HttpEasy config has already been set in ConcordionDomainBase using baseUrl from config.properties file

    	String response = HttpEasy.request()
                .baseURI("http://api.digitalnz.org/records.json")
                .queryParam("api_key", "J24kVvzD3shcEymxyHXs")
                .queryParam("and[primary_collection]", "New+Zealand+Gazette")
                .get()
                .getJsonReader()
                .asPrettyString();

        // Log response details in both log file and storyboard
        captureAction(Action.JSON_RESPONSE, "Get IP Address", "", response);

        return response;
    }
}
