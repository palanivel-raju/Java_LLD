package OOPS.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MethodInfo {
    String author() default "Unknown";
    String version() default "1.0";
    String date();
    String description();
}