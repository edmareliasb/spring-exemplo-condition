package com.exemplo.anotacao;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Conditional;

@Documented
@Retention(RUNTIME)
@Target({TYPE, METHOD})
@Conditional(ConditionAtivaBean.class)
public @interface AtivaBean {

    /**
     * O nome da propriedade que deve ser checada.
     */
    String property();

    /**
     * O valor que a propriedade deve ter (case-sensitive).
     */
    String valor();

}
