package org.projectodd.jrapidoc.annotation.rest;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotatation can be used on resource method<br/>
 * If more than one return option can be returned use this wrapper for them<br/>
 * <br/>
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DocReturns {
    DocReturn[] value();
}
