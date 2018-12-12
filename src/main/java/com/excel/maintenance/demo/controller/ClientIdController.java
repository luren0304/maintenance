package com.excel.maintenance.demo.controller;

import com.excel.maintenance.demo.domain.ClientID;
import com.excel.maintenance.demo.repository.ClientIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/clientid")
public class ClientIdController {

    @Autowired
    private ClientIdRepository clientIdRepository;

    @Value("${tyk.rest.api.host}")
    private String tykApiHost;

    @Value("${x-tyk-authorization}")
    private String authorizationVal;

    @Value("${tyk.header.authorization}")
    private String headerAuthoirzation;

    @RequestMapping(method = RequestMethod.POST, value = "/createclientid")
    public void createClientid(@RequestBody ClientID clientID){
        String api_id = clientID.getApi_id();
        List<String> redirectURLs = clientID.getRediectURLs();

        System.out.println("api_id = " + api_id + " , redirectURLs = " + redirectURLs);
        System.out.println("Tyk information : api host = " + tykApiHost);
        System.out.println("Tyk information : api host = " + tykApiHost);
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();


    }
}
