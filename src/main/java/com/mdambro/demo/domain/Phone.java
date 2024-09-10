package com.mdambro.demo.domain;

import lombok.*;

@Data
@Builder
public class Phone {

    private String countryCode;
    private String cityCode;
    private String number;

}
