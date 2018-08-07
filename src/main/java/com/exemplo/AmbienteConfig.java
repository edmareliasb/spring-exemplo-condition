package com.exemplo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.exemplo.ambiente.condition.DevSourceCondition;
import com.exemplo.ambiente.condition.ProdSourceCondition;
import com.exemplo.ambiente.util.Ambiente;
import com.exemplo.ambiente.util.AmbienteDev;
import com.exemplo.ambiente.util.AmbienteProducao;

@Configuration
public class AmbienteConfig {

    @Bean(name = "ambiente")
    @Conditional(value = DevSourceCondition.class)
    public Ambiente getDevDataSource() {
        return new AmbienteDev();
    }

    @Bean(name = "ambiente")
    @Conditional(value = ProdSourceCondition.class)
    public Ambiente getProdDataSource() {
        return new AmbienteProducao();
    }

}
