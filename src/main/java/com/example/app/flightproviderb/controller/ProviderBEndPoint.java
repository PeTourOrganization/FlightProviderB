package com.example.app.flightproviderb.controller;

import com.example.app.flightproviderb.service.SearchRequest;
import com.example.app.flightproviderb.service.SearchResult;
import com.example.app.flightproviderb.service.SearchService;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ProviderBEndPoint {
    private static final String NAMESPACE_URI = "http://petour.com/flights";
    private final SearchService searchService;

    public ProviderBEndPoint(SearchService searchService) {
        this.searchService = searchService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SearchRequest")
    @ResponsePayload
    public SearchResult getFlightsAvailable(@RequestPayload SearchRequest searchRequest) {
        return searchService.availabilitySearch(searchRequest);
    }

}
