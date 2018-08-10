package com.exemplo.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConditionalOnProperty(name = "habilita.controller3", havingValue = "true")
public class TesteController3 {

    @RequestMapping(path = "/api/v1/endpointTeste3", method = RequestMethod.GET)
    public String endpointTeste() {

        return "ENDPOINT 3";
    }

}
