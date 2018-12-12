package com.excel.maintenance.demo.repository;

import com.excel.maintenance.demo.domain.ClientID;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ClientIdRepository extends MongoRepository<ClientID, String> {

//    public List<ClientID> findClientIDByApi_id();
    public List<ClientID> findAllByApi_id(String api_id);

    public List<ClientID> findByClientid(String clientid);

}
