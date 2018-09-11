package com.exemplo.evento;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventSourceListener {

    @EventListener
    public void handleEventSource(EventSource evento){
        
        System.out.println("Registrando evento:  " + evento.getNotes());
    }
    
}
