package com.exemplo.evento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventSourcePublisher {
    
    @Autowired
    private ApplicationEventPublisher publisher;
    
    public void publish() {
        
        System.out.println("Publicando EventSource...");
        
        EventSource evento = new EventSource();
        publisher.publishEvent(evento);
    }
}
