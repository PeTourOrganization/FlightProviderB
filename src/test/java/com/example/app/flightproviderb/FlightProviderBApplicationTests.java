package com.example.app.flightproviderb;

import com.example.app.flightproviderb.service.SearchService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import javax.xml.xpath.XPathExpressionException;
import java.util.Collections;

import static org.springframework.ws.test.server.ResponseMatchers.xpath;
import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.noFault;

@SpringBootTest
class FlightProviderBApplicationTests {

    private final ApplicationContext applicationContext;
    private MockWebServiceClient mockClient;

    private SearchService searchService;


    public FlightProviderBApplicationTests(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @BeforeEach
    public void generateClient(){
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }


    @Test
    public void testGetFlightsAvailableSuccess() throws XPathExpressionException {
        var requestPayload = new StringSource(
                "<flig:SearchRequest xmlns:flig='http://localhost:8082/flights'>" +
                        "   <flig:origin>IST</flig:origin>" +
                        "   <flig:destination>JFK</flig:destination>" +
                        "   <flig:departureDate>2026-05-25T09:00:00</flig:departureDate>" +
                        "</flig:SearchRequest>"
        );

        mockClient.sendRequest(withPayload(requestPayload))
                .andExpect(noFault())
                .andExpect(xpath("//ns3:hasError",
                        Collections.singletonMap("ns3", "http://localhost:8082/flights"))
                        .evaluatesTo(false));
    }



    @Test
    void contextLoads() {
    }

}
