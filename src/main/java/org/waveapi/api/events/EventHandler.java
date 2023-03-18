package org.waveapi.api.events;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandler {
    int priority() default 0;
    boolean cancellable() default false;

}
