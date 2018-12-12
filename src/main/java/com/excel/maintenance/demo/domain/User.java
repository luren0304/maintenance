package com.excel.maintenance.demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "user")
public class User {
    private String username;
    private String pwd;
    private List<String> scopes;
}
