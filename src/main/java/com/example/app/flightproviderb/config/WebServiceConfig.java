package com.example.app.flightproviderb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean(name = "flights")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema flightsSchema){
        var wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("FlightsPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://localhost:8082/flights");
        wsdl11Definition.setSchema(flightsSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema flightsSchema(){
        return new SimpleXsdSchema(new ClassPathResource("xsd/flights.xsd"));
    }
}
