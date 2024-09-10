package com.mdambro.demo.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.*;

@Data
@Builder
public class User {

    private UUID id;
    private String name;
    private String email;
    private String password;
    private List<Phone> phones;
    private Date created;
    private Date lastLogin;
    private Date modified;
    private String token;
    private Boolean isActive;

}
