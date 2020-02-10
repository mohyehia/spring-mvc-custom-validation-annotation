package com.mohyehia.customvalidation.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = EmailConfirmationValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailConfirmation {
    String email();
    String confirmEmail();
    String message() default "Emails must match";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
