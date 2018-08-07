package com.exemplo.ambiente.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DevSourceCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata arg1) {
        String dbname = context.getEnvironment().getProperty("ambiente.name");
        return dbname.equalsIgnoreCase("dev");
    }

}
