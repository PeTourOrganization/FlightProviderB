package com.example.app.flightproviderb.service;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.LocalDateTime;

@XmlRootElement(name = "SearchRequest", namespace = "http://localhost:8082/flights")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchRequest {
	@XmlElement(required = true)
	private String origin = "";

	@XmlElement(required = true)
	private String destination = "";

	@XmlElement(required = true)
	private LocalDateTime departureDate;

	// Constructors
	public SearchRequest() {
	}

	public SearchRequest(String origin, String destination, LocalDateTime departureDate) {
		this.origin = origin;
		this.destination = destination;
		this.departureDate = departureDate;
	}

	// Getters and Setters
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDateTime departureDate) {
		this.departureDate = departureDate;
	}
}
