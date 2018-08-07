package com.exemplo.ambiente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.ambiente.util.Ambiente;

@Service
public class ExemploService {

    @Autowired
    private Ambiente ambiente;

    /*
     * public ExemploService(Ambiente ambiente) { this.ambiente = ambiente; }
     */

    public String imprimeNomeAmbiente() {

        String nome = ambiente.imprimeNomeAmbiente();
        System.out.println(nome);

        return nome;
    }


}
