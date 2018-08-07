package com.exemplo.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.anotacao.AtivaBean;

@AtivaBean(property = "nomeBean", valor = "555")
@RestController
public class TesteController {

    @PostConstruct
    public void inicializacao() {
        System.out.println("================ CONTROLLER INICIADO ============");
    }

    @RequestMapping(path = "/api/v1/endpointTeste", method = RequestMethod.GET)
    public String endpointTeste() {
        return "Funcionando";
    }

}
