package com.example.app.flightproviderb.controller;

import com.example.app.flightproviderb.service.ProviderBService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/providerB")
public class ProviderBController {
    private final ProviderBService providerBService;

    public ProviderBController(ProviderBService providerBService) {
        this.providerBService = providerBService;
    }

    @GetMapping("/flightsAvailable")
    public String getFlightsAvailable(
            @RequestParam String origin,
            @RequestParam String destination,
            @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") LocalDateTime departureDate
    ) {
        return providerBService.flightsAvailable(origin, destination, departureDate);
    }
}
