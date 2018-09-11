package com.exemplo.ambiente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemplo.evento.EventSourcePublisher;

@Service
public class ExemploService {

    @Autowired
    private EventSourcePublisher eventoSourcePublisher;
    
    
    public void servico() {
        eventoSourcePublisher.publish();
    }
    
  
}
