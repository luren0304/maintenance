package com.excel.maintenance.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "clientid")
public class ClientID {

    private String clientid;
    private String secret;
    private List<String> rediectURLs;
    private String api_id;

}
