package com.example.app.flightproviderb.service;

import com.example.app.flightproviderb.flightdetails.AirFaultMessage;
import com.example.app.flightproviderb.flightdetails.FlightInformationReq;
import com.example.app.flightproviderb.flightdetails.FlightService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProviderBService {
    public String flightsAvailable(String origin, String destination, LocalDateTime departureDate) throws AirFaultMessage {

        var service = new FlightService();

        FlightInformationReq req = new FlightInformationReq();


        var infoPort = service.getFlightInfoPort();
        var service2 = infoPort.service(req);
        var infoList = service2.getFlightInfo();

        service.getFlightDetailsPort();
        return "flights available";
    }

}
