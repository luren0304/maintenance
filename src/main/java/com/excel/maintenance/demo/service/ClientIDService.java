package com.excel.maintenance.demo.service;

import com.excel.maintenance.demo.domain.ClientID;
import com.excel.maintenance.demo.repository.ClientIdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientIDService {

    @Autowired
    private ClientIdRepository clientIdRepository;
    public  void createClientID(ClientID clientID){
        clientIdRepository.save(clientID);
    }

    public List<ClientID> findByApi_Id(String api_id){

        return clientIdRepository.findAllByApi_id(api_id);
    }
    public List<ClientID> findByClientID(String clientid){
        return  clientIdRepository.findByClientid(clientid);
    }
}
