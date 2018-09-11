package com.exemplo.evento;

import org.springframework.context.ApplicationEvent;

public class EventoA extends ApplicationEvent {

    private static final long serialVersionUID = 1L;

    public EventoA(Object source) {
        super(source);
    }


}
