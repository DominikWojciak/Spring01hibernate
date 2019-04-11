package pl.coderslab.app.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AgeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Age {
    String message() default "{pl.coderslab.app.validation.Age.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    int min();
}