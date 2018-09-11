package com.exemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.ambiente.service.ExemploService;

@RestController
public class TesteController {

    @Autowired
    private ExemploService exemploService;
    
    @RequestMapping(path = "/api/v1/endpoint", method = RequestMethod.GET)
    public String endpointTeste() {
        
        exemploService.servico();
        
        return "Funcionando";
    }

}
