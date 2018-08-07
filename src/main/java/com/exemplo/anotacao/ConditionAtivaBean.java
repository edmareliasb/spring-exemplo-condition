package com.exemplo.anotacao;

import java.util.Map;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionAtivaBean implements Condition {

    private static final String ANOTACAO = AtivaBean.class.getName();

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        Map<String, Object> atributosAnotacao = metadata.getAnnotationAttributes(ANOTACAO);

        if (atributosAnotacao.isEmpty()) {
            throw new IllegalStateException(
                    String.format("A classe %s está sendo utilizada sem ser em conjunto com a anotação @%s", this.getClass(), ANOTACAO));
        }

        String propriedade = (String) atributosAnotacao.get("property");
        String valorEsperado = (String) atributosAnotacao.get("valor");

        String valorConfigurado = context.getEnvironment().getProperty(propriedade);

        return (valorConfigurado != null) && (valorConfigurado.equals(valorEsperado));
    }

}
